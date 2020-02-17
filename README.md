<h1>AOE Metadata Utilities</h1>
<h2>Development Environment</h2>
<h3>Services</h3>
<ul>
<li>PostgreSQL Database (local) running on port 5432</li>
<li>Provider REST Service (jdk13 + maven 3.6.3) running on port 8001</li>
<li>Resolver DATA Service (jdk13 + maven 3.6.3) running on port 8002</li>
<li>Resolver REST Service (jdk13 + maven 3.6.3) running on port 8003</li>
</ul>
<p>
On your local host build project modules and docker images, download dependencies, populate database and run applications all at once.
</p>
<p>
Start applications (create containers):
</p>
<pre>
docker-compose -f docker-compose.dev.yml up --build -d
</pre>
<p>
Stop applications (remove containers):
</p>
<pre>
docker-compose -f docker-compose.dev.yml down
</pre>
<h2>Production Environment</h2>
<h3>Services</h3>
<ul>
<li>Provider REST Service (jdk13 + maven 3.6.3) running on port 8001</li>
<li>Resolver DATA Service (jdk13 + maven 3.6.3) running on port 8002</li>
<li>Resolver REST Service (jdk13 + maven 3.6.3) running on port 8003</li>
</ul>
<p>
On production server build project modules and docker images, configure external PostgreSQL data source, download dependencies and run applications all at once.
</p>
<p>
Start applications (create containers):
</p>
<pre>
docker-compose -f docker-comose.prod.yml up --build -d
</pre>
<p>
Stop applications (remove containers):
</p>
<pre>
docker-compose -f docker-comose.prod.yml down
</pre>
