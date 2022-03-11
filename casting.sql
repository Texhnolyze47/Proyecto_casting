-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 11-03-2022 a las 18:49:57
-- Versión del servidor: 10.4.22-MariaDB
-- Versión de PHP: 8.1.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `casting`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cadidatos-perfil`
--

CREATE TABLE `cadidatos-perfil` (
  `id` int(11) NOT NULL,
  `provincia` text NOT NULL,
  `sexo` text NOT NULL,
  `rango-altura` text NOT NULL,
  `rango-edad` text NOT NULL,
  `color-pelo` text NOT NULL,
  `color-ojo` text NOT NULL,
  `especialidad` text NOT NULL,
  `experiencia` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `candidatos`
--

CREATE TABLE `candidatos` (
  `id` int(11) NOT NULL,
  `nombre` text NOT NULL,
  `direccion` text NOT NULL,
  `telefono` int(11) NOT NULL,
  `fecha-nacimiento` date NOT NULL,
  `biografia` varchar(200) NOT NULL,
  `perfil` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `casting-agente`
--

CREATE TABLE `casting-agente` (
  `num-empleado` int(11) NOT NULL,
  `DNI` text NOT NULL,
  `nombre` text NOT NULL,
  `direccion` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `casting-contratos`
--

CREATE TABLE `casting-contratos` (
  `id` int(11) NOT NULL,
  `nombre` text NOT NULL,
  `fecha-contrato` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `casting-presencial`
--

CREATE TABLE `casting-presencial` (
  `id` int(11) NOT NULL,
  `numero-personas` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `casting-prueba`
--

CREATE TABLE `casting-prueba` (
  `id` int(11) NOT NULL,
  `fecha` date NOT NULL,
  `sala` text NOT NULL,
  `descripcion` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

CREATE TABLE `clientes` (
  `codigo-cliente` int(11) NOT NULL,
  `nombre` text NOT NULL,
  `direccion` text NOT NULL,
  `telefono` int(10) NOT NULL,
  `persona-contacto` text NOT NULL,
  `acatividad` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `representate`
--

CREATE TABLE `representate` (
  `id` int(11) NOT NULL,
  `NIF` text NOT NULL,
  `nombre` text NOT NULL,
  `telefono` int(10) NOT NULL,
  `direccion` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cadidatos-perfil`
--
ALTER TABLE `cadidatos-perfil`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `candidatos`
--
ALTER TABLE `candidatos`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `casting-agente`
--
ALTER TABLE `casting-agente`
  ADD PRIMARY KEY (`num-empleado`);

--
-- Indices de la tabla `casting-contratos`
--
ALTER TABLE `casting-contratos`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `casting-presencial`
--
ALTER TABLE `casting-presencial`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `casting-prueba`
--
ALTER TABLE `casting-prueba`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`codigo-cliente`);

--
-- Indices de la tabla `representate`
--
ALTER TABLE `representate`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `cadidatos-perfil`
--
ALTER TABLE `cadidatos-perfil`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `candidatos`
--
ALTER TABLE `candidatos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `casting-agente`
--
ALTER TABLE `casting-agente`
  MODIFY `num-empleado` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `casting-contratos`
--
ALTER TABLE `casting-contratos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `casting-presencial`
--
ALTER TABLE `casting-presencial`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `casting-prueba`
--
ALTER TABLE `casting-prueba`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `clientes`
--
ALTER TABLE `clientes`
  MODIFY `codigo-cliente` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `representate`
--
ALTER TABLE `representate`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
