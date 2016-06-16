package com.caiyu.hearthstone.model.daomanager;

import com.caiyu.hearthstone.model.dao.CardDao;
import com.caiyu.hearthstone.model.dao.DaoLoader;
import com.caiyu.hearthstone.model.entity.CardEntity;

import java.util.List;

/**
 * Created by 渝 on 2016/6/16.
 */
public class CardDaoManager implements IDaoManager<CardEntity> {

    private CardDao cardDao;

    public CardDaoManager() {
        cardDao = DaoLoader.getDaoSession().getCardDao();
    }

    @Override
    public void addData(CardEntity cardEntity) {
        if (cardDao != null && cardEntity != null)
            cardDao.insertOrReplace(cardEntity);
    }

    @Override
    public void deleteByKey(long id) {
        if (cardDao != null)
            cardDao.deleteByKey(id);
    }

    @Override
    public CardEntity getDataById(long id) {
        if (cardDao != null)
            return cardDao.load(id);
        return null;
    }

    @Override
    public List<CardEntity> getAll() {
        if (cardDao != null)
            return cardDao.loadAll();
        return null;
    }

    @Override
    public void update(CardEntity cardEntity) {
        if (cardDao != null)
            cardDao.update(cardEntity);
    }
}
