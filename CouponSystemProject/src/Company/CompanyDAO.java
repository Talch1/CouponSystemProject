package Company;

import java.sql.SQLException;
import java.util.Collection;

import Coupon.Coupon;

public interface CompanyDAO {
	public static void createCompany(Company company) throws SQLException {
	}

	public static void removeCompany(Company company) throws SQLException {
	}

	public static void updateCompany(Company company) {
	}

	public Company getCompany(long id);

	public Collection<Company> getAllCompany();

	public Collection<Coupon> getCoupon();

	public boolean login();

}
