package fr.epita.quiz.quiz_manager;

import javax.inject.Inject;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import fr.epita.quiz.datamodel.Question;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/application.xml")
public class TestHibernet {
	
	private static final Logger LOGGER = LogManager.getLogger(TestHibernet.class);
	
	@Inject
	SessionFactory sf;
	
	@Test
	public void testHibernett() {
		
		Session openSession = sf.openSession();
		Question question = new Question();
		question.setQuestion("How to use Maven?");
		openSession.save(question);
		LOGGER.info("Maven saved!");
		Assert.assertNotEquals(0l, question.getId());
	}
}