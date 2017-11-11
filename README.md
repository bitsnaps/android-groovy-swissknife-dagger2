# android-groovy-swissknife-dagger2

It is a simple android project, it contains:
- Groovy
- Swisskife
- and Dagger 2

##Changes 11-11-2017:

- updates to use new versions: com.android.tools.build:gradle:2.3.3,  groovy-android-gradle-plugin:1.1.0, dagger:2.11...
 - remove unnecessary dependency: dexcount, javax.annotation...
 - add @CompileStatic for all classes, and use @Canonical on domains, Delegates on domain properties (you can add more...)
 This example can be improved to be better MVC/MVP example if you can add an ORM (such as SugarORM)


##Changes (by davidwong):

Demonstrate Dagger 2 and Groovy using the @Inject annotation.

See the blog for an explanation:
[http://www.davidwong.com.au/blog/2016/07/groovy-and-dagger-2-android-example/](http://www.davidwong.com.au/blog/2016/07/groovy-and-dagger-2-android-example/ "Blog article")