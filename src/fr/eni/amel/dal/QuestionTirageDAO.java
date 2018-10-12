package fr.eni.amel.dal;

import java.util.List;

import fr.eni.amel.bo.QuestionTirage;
import fr.eni.tp.web.common.dal.dao.GenericDAO;
import fr.eni.tp.web.common.dal.exception.DaoException;

public interface QuestionTirageDAO extends GenericDAO{

	public QuestionTirage selectById(int idQuestion, int idEpreuve)  throws DaoException;
	
	public List<QuestionTirage> selectByIdEpreuve(Object id) throws DaoException;
	
	public void createReponse(Integer idEpreuve, Integer idQuestion,Integer idProposition) throws DaoException;
	
	public void deleteReponse(Integer idEpreuve, Integer idQuestion,Integer idProposition) throws DaoException;

}
