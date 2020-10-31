# Calculadora de horas de trabajo

Caso de implementación Nº 2.

Descripción del caso de implementación

Implementar una plataforma compuesta por un backend y un frontend, donde se cumplan
los módulos y las reglas de negocio mencionadas en este documento.

La empresa IAS HandyMan ofrece servicios de reparación para hogares por medio de la línea telefónica, el proceso es el siguiente:

1. Un cliente llama a la línea y solicita un servicio
2. Un técnico es enviado a atender el servicio
3. El técnico reporta las horas que le tomó realizar el servicio.

La empresa también cuenta con servicios de atención de emergencias, dónde se puede
solicitar un técnico en cualquier momento del día, cualquier día.

Para la empresa, el cálculo de nómina ha sido especialmente difícil, debido a la cantidad de
tiempo invertida en el cálculo de las horas de trabajo de cada técnico, calcular horas extras,
horas dominicales y horas nocturnas.

Usted ha sido seleccionado para realizar esta calculadora, donde recibirá el reporte de los
técnicos y entregará por medio de una consulta, para un técnico, cuál es su calculo de
horas trabajadas por semana.

# Módulo de reporte de servicio

Este módulo contiene las funcionalidades que hacen posible que un técnico haga un reporte
de la atención a un servicio una vez fue terminado.

Funcionalidades
- Reporte de atención a servicio por técnico

Reglas de negocio

Campos de un reporte de servicio:
- Identificación del técnico.
- Identificación del servicio.
- Fecha y hora de inicio.
- Fecha y hora de fin.

Consideraciones
- La identificación del técnico y del servicio son cadenas de texto, NO es requerido
realizar un módulo de técnicos o de servicios.
- Debe validarse que ningún campo sea nulo.
- La fecha de inicio debe ser menor que la fecha de fin.
