package com.example.erp.dao.implementation;

import com.example.erp.bean.Bills;
import com.example.erp.dao.BillsDao;
import com.example.erp.utils.SessionUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class BillsDaoimpl implements BillsDao {

    @Override
    public boolean registerBill(Bills bill) {
        try (Session session = SessionUtil.getSession()) {
            Transaction transaction = session.beginTransaction();
            session.save(bill);
            transaction.commit();
            return true;
        } catch (HibernateException exception) {
            System.out.print(exception.getLocalizedMessage());
            return false;
        }
}}
