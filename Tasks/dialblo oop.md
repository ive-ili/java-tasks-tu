### Задача: Игра, вдъхновена от Diablo

#### Обща информация:
Проектирайте опростена версия на игра, вдъхновена от Diablo, използвайки Java. Включете герои, предмети и чудовища. Използвайте HashSet и LinkedList за управление на данните и въведете абстракция чрез интерфейси. Реализирайте логика в класовете за симулиране на повишаване на нивото на героите и засилване на атрибутите от събрани предмети.

#### Класове и Интерфейси:

1. **Entity (Абстрактен Клас):**
   - Полета:
     - `name` (protected): Представлява името на съществото.
   - Методи:
     - `getName()`: Връща името на съществото.

2. **Attacker (Интерфейс):**
   - Методи:
     - `attack(Character target)`: Обявява атакуващо поведение за същества.

3. **Damageable (Интерфейс):**
   - Методи:
     - `receiveDamage(int damage)`: Обявява поведението за същества, които могат да получават щети.

4. **Character (Клас, разширява Entity, имплементира Attacker, Damageable):**
   - Полета:
     - `health`: Представлява точките на здраве на героя.
     - `damage`: Представлява точките на щети, които героят може да нанася.
     - `level`: Представлява нивото на героя.
   - Методи:
     - `attack(Character target)`: Пренаписва метода за атака, указвайки атакуващото действие на героя.
     - `receiveDamage(int damage)`: Пренаписва метода за получаване на щети, обработвайки начина, по който героят получава щети.
     - `levelUp()`: Увеличава нивото на героя.

5. **Item (Клас, разширява Entity):**
   - Полета:
     - `attributeBoost` (String): Представлява засилването на атрибутите, предоставяни от предмета.

6. **Monster (Клас, разширява Entity, имплементира Attacker, Damageable):**
   - Полета:
     - `health`: Представлява точките на здраве на чудовището.
     - `damage`: Представлява точките на щети, които чудовището може да нанася.
   - Методи:
     - `attack(Character target)`: Пренаписва метода за атака, указвайки атакуващото действие на чудовището.
     - `receiveDamage(int damage)`: Пренаписва метода за получаване на щети, обработвайки начина, по който чудовището получава щети.

7. **Game (Клас):**
   - Полета:
     - `characters`: HashSet от обекти Character.
     - `monsters`: HashSet от обекти Monster.
     - `items`: LinkedList от обекти Item.
   - Методи:
     - `addCharacter(Character character)`: Добавя герой към играта.
     - `removeCharacter(Character character)`: Премахва герой от играта.
     - `addMonster(Monster monster)`: Добавя чудовище към играта.
     - `removeMonster(Monster monster)`: Премахва чудовище от играта.
     - `addItem(Item item)`: Добавя предмет към играта.
     - `removeItem(Item item)`: Премахва предмет от играта.
     - `attack(Character attacker, Monster target)`: Симулира атака, въвеждайки шанс за събиране на предмети.
     - `collectItem(Character character, Item item)`: Симулира героите при събиране на предмети и засилване на атрибутите.
     - `applyAttributeBoost(Character character, Item item)`: Прилага засилването на атрибутите от предмета към героя.	
     - `displayGameState()`: Показва текущото състояние на играта, включително броят на героите, чудовищата и предметите.

#### Инструкции:

1. Реализирайте гореспоменатите класове и интерфейси с подходящи методи и полета.

2. Създайте инстанции на герои, чудовища и предмети в `main` метода на класа `DiabloGame`.

3. Добавете тези инстанции към класа `Game`, използвайки предоставените методи.

4. Симулирайте взаимодействия между герои и чудовища (например, героите атакуват чудовищата).

5. Симулирайте шанса за събиране на предмети, когато чудовище бъде победено.

6. Симулирайте героите, събиращи предмети и прилагащи засилването на атрибутите.

7. Въведете концепцията за повишаване на нивото на героите.

8. Покажете началното и актуалното състояние на играта, използвайки метода `displayGameState`.