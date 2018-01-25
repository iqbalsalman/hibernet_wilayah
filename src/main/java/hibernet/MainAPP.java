/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernet;

import com.hibernet.Model.Kecamatan;
import com.hibernet.Model.Kelurahan;
import com.hibernet.Model.KotaKabupaten;
import hibernet.util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author iqbal
 */
public class MainAPP {

    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        String result = getNativeQuery(session, "select version()");
        System.out.println(result);

        List<KotaKabupaten> listpro = getProvinsi(session);
        for (KotaKabupaten kotaKabupaten : listpro) {
            System.out.println("kotaKabupaten  " + kotaKabupaten.getNama_kab() + " - " + kotaKabupaten.getProvinsi().getNm_provinsi());
        }
        List<Kecamatan> listkec = getKecamatan(session);
        for (Kecamatan kecamatan : listkec) {
            System.out.println(" Kecamatan " + kecamatan.getNama_kecamatan() + " - " + kecamatan.getKotakabupaten().getNama_kab());
        }
//                 
        List<Kelurahan> list = getKelurahan(session);
        for (Kelurahan kelurahan : list) {
            System.out.println(" Kelurahan  " + kelurahan.getNama_kel() + " - " + kelurahan.getKecamatan().getNama_kecamatan());
        }

        session.getTransaction().commit();
        session.close();

        HibernateUtil.shutdown();

    }

    private static List<KotaKabupaten> getProvinsi(Session session) {
        return session.createQuery("select b from KotaKabupaten b JOIN FETCH b.provinsi").getResultList();
    }

    private static List<Kecamatan> getKecamatan(Session session) {
        return session.createQuery("select b from Kecamatan b JOIN FETCH b.kotakabupaten").getResultList();
    }

    private static List<Kelurahan> getKelurahan(Session session) {
        return session.createQuery("select b from Kelurahan  b JOIN FETCH b.kecamatan").getResultList();
    }

    private static String getNativeQuery(Session session, String sql) {

        return (String) session.createNativeQuery(sql).getSingleResult();
    }

}
