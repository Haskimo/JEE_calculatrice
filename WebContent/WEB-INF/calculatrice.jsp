<%@ page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Calculatrice</title>
    </head>
    <body>
        <form method="post" action="">
            <input name ="nombre1" type="number" size=3/>
            <select name="operateur" size="1">
                <option value="+">+</option>
                <option value="-">-</option>
                <option value="*">x</option>
                <option value="/">/</option>
            </select>
            <input name ="nombre2" type="number" size=3/>
            <input type="submit" value=" = " />
        </form>
        <p>Résultat : ${operation.nombre1} ${operation.operateur} ${operation.nombre2} = ${operation.resultat}</p>
    </body>
</html>