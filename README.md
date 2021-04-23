# Profundización en Ingeniería del Software
## Examen final

**Se pide:**

1. Realice un fork del repositorio https://github.com/GRISE-UPM/PROF_2018_EXFINAL. El nuevo repositorio deberá ser de su propiedad, esto es, no estará ubicado bajo la organización GRISE-UPM. El repositorio deberá ser públicamente accesible.

2. Ejecute los *Smoke Tests*. Deberán fallar todos, debido a que la hora de celebración de este examen son las 15:00. Por ello, el mensaje generado por la clase ``Greeting`` será ``Good afternoon`` o ``Buenas tardes``.

3. Cree una rama con nombre ``trabajo`` en su repositorio. Todo lo que se pide en el examen deberá realizarse en esta rama.

4. Elimine la dependencia que existe entre ``Greeting`` y la clase ``java.util.Calendar``, utilizando inyección de dependencia. Denomine a la clase inyectable ``MyCalendar``.

5. Realice un commit de los cambios. El comentario debe ser significativo.

6. Reescriba los *Smoke Tests* utilizando un mock de la clase ``MyCalendar``. Las dependencias para Mockito ya están definidas en ``pom.xml``. 

7. Realice un commit de los cambios. El comentario debe ser significativo.

8. Realice las tareas indicadas a continuación:

   a. Replique el test ``smokeTest1()``. Puede llamarle ``test4()``. Debe comprobar que ``test4()`` invoca una vez al método ``Message.getDefaultMessage()``, y una vez al método ``Message.getMessage()``.

   b. Replique el test ``smokeTest2()`` de igual manera que en el caso anterior. Puede llamarle ``test5()``. Debe comprobar que invoca una vez al método ``Message.getMessage()``, pero no invoca nunca al método ``Message.getDefaultMessage()``.

9. Realice un commit de los cambios. El comentario debe ser significativo.

10. Realice un pull request. Incluya su nombre y apellidos en el comentario.

**Con esto termina el examen.**
