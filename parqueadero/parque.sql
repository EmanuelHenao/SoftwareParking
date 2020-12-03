-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 18-09-2015 a las 13:29:31
-- Versión del servidor: 5.6.17
-- Versión de PHP: 5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `parque`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `dparqueadero`
--

CREATE TABLE IF NOT EXISTS `dparqueadero` (
  `nombre` varchar(40) NOT NULL,
  `nit` varchar(30) NOT NULL,
  `direccion` varchar(30) NOT NULL,
  `telefono` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `dparqueadero`
--

INSERT INTO `dparqueadero` (`nombre`, `nit`, `direccion`, `telefono`) VALUES
('Golden', '1323455', 'mz45 -98kd', '321654');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `dpermanente`
--

CREATE TABLE IF NOT EXISTS `dpermanente` (
  `placa` varchar(15) NOT NULL,
  `tarifaU` int(11) NOT NULL,
  `fechaIn` date NOT NULL,
  `pagoo` int(11) NOT NULL,
  `nombreCliente` varchar(40) NOT NULL,
  `telefono` varchar(15) NOT NULL,
  `esSer` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `dpermanente`
--

INSERT INTO `dpermanente` (`placa`, `tarifaU`, `fechaIn`, `pagoo`, `nombreCliente`, `telefono`, `esSer`) VALUES
('asd', 10000, '2015-09-18', 0, 'ema', '3681818', 'Pago'),
('', 0, '2015-09-18', 0, '', '', 'Debe'),
('4g', 20000, '2015-09-18', 5000, 'antonio', '32651', 'Pago');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `dtarifa`
--

CREATE TABLE IF NOT EXISTS `dtarifa` (
  `tipovehiculo` varchar(20) NOT NULL,
  `tarifa` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `dtarifa`
--

INSERT INTO `dtarifa` (`tipovehiculo`, `tarifa`) VALUES
('automovil', 1000);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `duser`
--

CREATE TABLE IF NOT EXISTS `duser` (
  `nuser` varchar(40) NOT NULL,
  `contraseña` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `duser`
--

INSERT INTO `duser` (`nuser`, `contraseña`) VALUES
('Rafael', '123');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `dvehiculo`
--

CREATE TABLE IF NOT EXISTS `dvehiculo` (
  `placa` varchar(10) NOT NULL,
  `tipovehiculo` varchar(15) NOT NULL,
  `tarifa` int(11) NOT NULL,
  `fecha` date NOT NULL,
  `hora` time NOT NULL,
  `estado` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `dvehiculo`
--

INSERT INTO `dvehiculo` (`placa`, `tipovehiculo`, `tarifa`, `fecha`, `hora`, `estado`) VALUES
('4daas', 'automovil', 1000, '2015-09-13', '01:27:50', 'ocupado');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `dvehitemre`
--

CREATE TABLE IF NOT EXISTS `dvehitemre` (
  `placa` varchar(10) NOT NULL,
  `tipovehiculo` varchar(15) NOT NULL,
  `tarifa` int(11) NOT NULL,
  `fecha` date NOT NULL,
  `hora` time NOT NULL,
  `fechaSalida` date NOT NULL,
  `horaSalida` time NOT NULL,
  `tiempo` int(11) NOT NULL,
  `totalaPagar` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
