import ch13_packages_and_imports.bobsrockets.Fruit.Apple // This imports just members Apple and Orange from object Fruits
Apple

import ch13_packages_and_imports.bobsrockets.Fruit.{Apple => McIntosh} // This imports the two members Apple and Orange from object Fruits. However, the Apple object is renamed to McIntosh, so this object can be accessed with either Fruits.Apple or McIntosh. A renaming clause is always of the form "<original-name> => <new-name>".
McIntosh

import java.sql.{Date => SDate} // This imports the SQL date class as SDate, so that you can simultaneously import the normal Java date class as simply Date.
SDate.valueOf("")

import java.{sql => S} //This imports the java.sql package as S, so that you can write things like S.Date.
S.Date

import ch13_packages_and_imports.bobsrockets.Fruit._ //This imports all members from object Fruits. It means the same thing as import Fruits._.
Pear

import ch13_packages_and_imports.bobsrockets.Fruit.{Apple => McIntosh, _} //This imports all members from object Fruits but renames Apple to McIntosh.
McIntosh
Pear

import ch13_packages_and_imports.bobsrockets.Fruit.{Pear => _} //This imports all members of Fruits except Pear. A clause of the form "<original-name> => _" excludes <original-name> from the names that are imported.


