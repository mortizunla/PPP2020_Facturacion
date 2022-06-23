package sgh.mansilla.modelo.negocio.hotel;

import java.util.List;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import sgh.mansilla.modelo.dao.AbstractDao.OrderType;
import sgh.mansilla.modelo.dao.DaoGenerico;
import sgh.mansilla.modelo.datos.hotel.CaracteristicaHabitacion;
import sgh.mansilla.modelo.negocio.ABMGenerico;

@Service("caracteristicaHabitacionABM")
@Transactional
public class DefaultCaracteristicaHabitacionABM extends ABMGenerico<Integer, CaracteristicaHabitacion> implements CaracteristicaHabitacionABM {

	protected final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Override
	@Autowired
	@Qualifier("caracteristicaHabitacionDao")
	public void setDao(DaoGenerico<Integer, CaracteristicaHabitacion> dao) {
		super.setDao(dao);
	}

	@Override
	public void guardar(CaracteristicaHabitacion entidad) {
		super.guardar(entidad);
	}

	@Override
	protected void actualizarEntidad(CaracteristicaHabitacion entidadPersistida, CaracteristicaHabitacion entidadActualizada) {
		entidadPersistida.setDescripcion(entidadActualizada.getDescripcion());
	}

	@Override
	public List<CaracteristicaHabitacion> listar() {
		return dao.list(true, OrderType.ASCENDING, "idCaracteristicaHabitacion");
	}
}
