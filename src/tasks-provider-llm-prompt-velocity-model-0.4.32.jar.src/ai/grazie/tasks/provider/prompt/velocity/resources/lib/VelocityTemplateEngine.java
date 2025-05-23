/*     */ package ai.grazie.tasks.provider.prompt.velocity.resources.lib;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import org.apache.velocity.app.VelocityEngine;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\002\n\002\020$\n\002\b\004\n\002\030\002\n\002\030\002\n\000\b6\030\000 \f2\0020\001:\003\f\r\016B\021\b\002\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J$\020\006\032\0020\0072\006\020\b\032\0020\0072\024\020\t\032\020\022\004\022\0020\007\022\006\022\004\030\0010\0010\nJ\020\020\013\032\0020\0072\006\020\b\032\0020\007H\024R\016\020\002\032\0020\003X\004¢\006\002\n\000\001\002\017\020¨\006\021"}, d2 = {"Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityTemplateEngine;", "", "velocityEngine", "Lorg/apache/velocity/app/VelocityEngine;", "<init>", "(Lorg/apache/velocity/app/VelocityEngine;)V", "render", "", "templatePath", "vars", "", "adjustTemplatePath", "Companion", "Classpath", "Relative", "Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityTemplateEngine$Classpath;", "Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityTemplateEngine$Relative;", "tasks-provider-llm-prompt-velocity-model"})
/*     */ @SourceDebugExtension({"SMAP\nVelocityTemplateEngine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VelocityTemplateEngine.kt\nai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityTemplateEngine\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,160:1\n216#2,2:161\n*S KotlinDebug\n*F\n+ 1 VelocityTemplateEngine.kt\nai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityTemplateEngine\n*L\n78#1:161,2\n*E\n"})
/*     */ public abstract class VelocityTemplateEngine {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   @NotNull
/*     */   private final VelocityEngine velocityEngine;
/*     */   @NotNull
/*     */   public static final String NEWLINE = "newline";
/*     */   
/*     */   private VelocityTemplateEngine(VelocityEngine velocityEngine) {
/*  18 */     this.velocityEngine = velocityEngine;
/*     */   }
/*     */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000@\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\000\n\002\030\002\n\002\030\002\n\002\020\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\b\004\b\003\030\0002\0020\001:\001\027B\t\b\002¢\006\004\b\002\020\003J1\020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\0132\027\020\f\032\023\022\004\022\0020\016\022\004\022\0020\0170\r¢\006\002\b\020H\007JZ\020\021\032\023\022\004\022\002H\022\022\004\022\0020\0170\r¢\006\002\b\020\"\004\b\000\020\02224\020\023\032\033\022\027\b\001\022\023\022\004\022\002H\022\022\004\022\0020\0170\r¢\006\002\b\0200\024\"\023\022\004\022\002H\022\022\004\022\0020\0170\r¢\006\002\b\020H\002¢\006\002\020\025J)\020\f\032\0020\0162\b\b\002\020\n\032\0020\0132\027\020\026\032\023\022\004\022\0020\016\022\004\022\0020\0170\r¢\006\002\b\020R\016\020\004\032\0020\005XT¢\006\002\n\000¨\006\030"}, d2 = {"Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityTemplateEngine$Companion;", "", "<init>", "()V", "NEWLINE", "", "create", "Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityTemplateEngine;", "rootUri", "Ljava/net/URI;", "enableTracing", "", "configureVelocityEngine", "Lkotlin/Function1;", "Lorg/apache/velocity/app/VelocityEngine;", "", "Lkotlin/ExtensionFunctionType;", "combine", "T", "blocks", "", "([Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function1;", "customConfig", "Tools", "tasks-provider-llm-prompt-velocity-model"})
/*     */   @SourceDebugExtension({"SMAP\nVelocityTemplateEngine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VelocityTemplateEngine.kt\nai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityTemplateEngine$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,160:1\n13402#2,2:161\n*S KotlinDebug\n*F\n+ 1 VelocityTemplateEngine.kt\nai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityTemplateEngine$Companion\n*L\n51#1:161,2\n*E\n"})
/*     */   public static final class Companion { private Companion() {}
/*     */     @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\016\n\002\b\002\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\016\020\004\032\0020\005XT¢\006\002\n\000R\016\020\006\032\0020\005XT¢\006\002\n\000¨\006\007"}, d2 = {"Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityTemplateEngine$Companion$Tools;", "", "<init>", "()V", "YAML_ESCAPING", "", "JSON_ESCAPING", "tasks-provider-llm-prompt-velocity-model"})
/*     */     public static final class Tools {
/*     */       @NotNull
/*     */       public static final Tools INSTANCE = new Tools(); @NotNull
/*     */       public static final String YAML_ESCAPING = "yamlEscapingTool"; @NotNull
/*     */       public static final String JSON_ESCAPING = "jsonEscapingTool"; }
/*     */     @JvmStatic
/*     */     @NotNull
/*     */     public final VelocityTemplateEngine create(@NotNull URI rootUri, boolean enableTracing, @NotNull Function1<? super VelocityEngine, Unit> configureVelocityEngine) {
/*  32 */       Intrinsics.checkNotNullParameter(rootUri, "rootUri"); Intrinsics.checkNotNullParameter(configureVelocityEngine, "configureVelocityEngine"); String str = rootUri.getScheme();
/*  33 */       FileSystem fileSystem = VelocityTemplateEngineKt.getFileSystem(rootUri); Throwable throwable = null; try { FileSystem it = fileSystem; int $i$a$-use-VelocityTemplateEngine$Companion$create$1 = 0; VelocityTemplateEngine.Classpath classpath = 
/*  34 */           VelocityTemplateEngine.Classpath.Companion.create(
/*  35 */             enableTracing, 
/*  36 */             configureVelocityEngine); }
/*     */       catch (Throwable throwable1) { throwable = throwable1 = null; throw throwable1; }
/*     */       finally { CloseableKt.closeFinally(fileSystem, throwable); }
/*  39 */        if (Intrinsics.areEqual(str, "file")) {
/*     */         
/*  41 */         Intrinsics.checkNotNullExpressionValue(Paths.get(rootUri), "get(...)");
/*     */       
/*     */       }
/*     */       else {
/*     */         
/*  46 */         UtilsKt.velocityLibraryException$default("Unsupported root URI scheme: " + rootUri.getScheme(), null, 2, null); throw new KotlinNothingValueException();
/*     */       } 
/*     */       return Intrinsics.areEqual(str, "jar") ? classpath : (VelocityTemplateEngine)"JD-Core does not support Kotlin";
/*     */     }
/*  50 */     private final <T> Function1<T, Unit> combine(Function1... blocks) { return blocks::combine$lambda$2; }
/*  51 */     @NotNull public final VelocityEngine configureVelocityEngine(boolean enableTracing, @NotNull Function1 customConfig) { Object object2; Intrinsics.checkNotNullParameter(customConfig, "customConfig"); VelocityEngine velocityEngine1 = new VelocityEngine(), $this$configureVelocityEngine_u24lambda_u245 = velocityEngine1; int $i$a$-apply-VelocityTemplateEngine$Companion$configureVelocityEngine$1 = 0; $this$configureVelocityEngine_u24lambda_u245.setProperty("parser.space_gobbling", "STRUCTURED"); $this$configureVelocityEngine_u24lambda_u245.setProperty("runtime.strict_mode.enable", Boolean.valueOf(true)); $this$configureVelocityEngine_u24lambda_u245.setProperty("event_handler.include.class", IncludeRelativePath.class.getName()); $this$configureVelocityEngine_u24lambda_u245.setProperty("runtime.custom_directives", "ai.grazie.tasks.provider.prompt.velocity.resources.utils.ErrorDirective"); if (enableTracing) $this$configureVelocityEngine_u24lambda_u245.setProperty("runtime.log.track_location", Boolean.valueOf(true));  customConfig.invoke($this$configureVelocityEngine_u24lambda_u245); VelocityEngine velocityEngine2 = $this$configureVelocityEngine_u24lambda_u245; try { VelocityEngine $this$configureVelocityEngine_u24lambda_u245_u24lambda_u243 = velocityEngine2; int $i$a$-runCatching-VelocityTemplateEngine$Companion$configureVelocityEngine$1$1 = 0; $this$configureVelocityEngine_u24lambda_u245_u24lambda_u243.init(); object2 = Result.constructor-impl(Unit.INSTANCE); } catch (Throwable throwable) { object2 = Result.constructor-impl(ResultKt.createFailure(throwable)); }  Object object1 = object2; if (Result.exceptionOrNull-impl(object1) == null) { Result.exceptionOrNull-impl(object1); } else { Throwable it; int $i$a$-getOrElse-VelocityTemplateEngine$Companion$configureVelocityEngine$1$2 = 0; throw new VelocityLibraryException("Failed to initialize VelocityEngine", it); }  return velocityEngine1; } private static final Unit combine$lambda$2(Function1[] $blocks, Object <this>) { Function1[] arrayOfFunction1 = $blocks; int $i$f$forEach = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 161 */       byte b = 0; int i = arrayOfFunction1.length; if (b < i) { Object element$iv = arrayOfFunction1[b], object1 = element$iv; int $i$a$-forEach-VelocityTemplateEngine$Companion$combine$1$1 = 0; object1.invoke(<this>); }  return Unit.INSTANCE; } } @NotNull public final String render(@NotNull String templatePath, @NotNull Map vars) { Intrinsics.checkNotNullParameter(templatePath, "templatePath"); Intrinsics.checkNotNullParameter(vars, "vars"); VelocityContext velocityContext1 = new VelocityContext(), $this$render_u24lambda_u241 = velocityContext1; int $i$a$-apply-VelocityTemplateEngine$render$context$1 = 0; $this$render_u24lambda_u241.put("newline", "\n"); $this$render_u24lambda_u241.put("yamlEscapingTool", VelocityYamlEscapingTool.INSTANCE); $this$render_u24lambda_u241.put("jsonEscapingTool", VelocityJsonEscapingTool.INSTANCE); Map $this$forEach$iv = vars; int $i$f$forEach = 0; Iterator<Map.Entry> iterator = $this$forEach$iv.entrySet().iterator(); if (iterator.hasNext()) { Map.Entry element$iv = iterator.next(), entry1 = element$iv; int $i$a$-forEach-VelocityTemplateEngine$render$context$1$1 = 0;
/*     */       String key = (String)entry1.getKey();
/*     */       Object value = entry1.getValue();
/*     */       $this$render_u24lambda_u241.put(key, value); }
/*     */     
/*     */     VelocityContext context = velocityContext1;
/*     */     StringWriter stringWriter = new StringWriter();
/*     */     Throwable throwable = null;
/*     */     try {
/*     */       StringWriter writer = stringWriter;
/*     */       int $i$a$-use-VelocityTemplateEngine$render$1 = 0;
/*     */       this.velocityEngine.getTemplate(adjustTemplatePath(templatePath)).merge((Context)context, writer);
/*     */       String str = writer.toString();
/*     */     } catch (Throwable throwable1) {
/*     */       throwable = throwable1 = null;
/*     */       throw throwable1;
/*     */     } finally {
/*     */       CloseableKt.closeFinally(stringWriter, throwable);
/*     */     } 
/*     */     Intrinsics.checkNotNullExpressionValue(str, "use(...)");
/*     */     return str; }
/*     */ 
/*     */   
/*     */   @JvmStatic
/*     */   @NotNull
/*     */   public static final VelocityTemplateEngine create(@NotNull URI rootUri, boolean enableTracing, @NotNull Function1<? super VelocityEngine, Unit> configureVelocityEngine) {
/*     */     return Companion.create(rootUri, enableTracing, configureVelocityEngine);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   protected String adjustTemplatePath(@NotNull String templatePath) {
/*     */     Intrinsics.checkNotNullParameter(templatePath, "templatePath");
/*     */     return templatePath;
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\013\n\000\n\002\030\002\n\002\020\002\n\002\030\002\n\002\b\003\030\000 \r2\0020\001:\001\rB\021\b\002\022\006\020\002\032\0020\003¢\006\004\b\004\020\005B.\b\027\022\b\b\002\020\006\032\0020\007\022\031\b\002\020\b\032\023\022\004\022\0020\003\022\004\022\0020\n0\t¢\006\002\b\013¢\006\004\b\004\020\fR\016\020\002\032\0020\003X\004¢\006\002\n\000¨\006\016"}, d2 = {"Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityTemplateEngine$Classpath;", "Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityTemplateEngine;", "velocityEngine", "Lorg/apache/velocity/app/VelocityEngine;", "<init>", "(Lorg/apache/velocity/app/VelocityEngine;)V", "enableTracing", "", "configureVelocityEngine", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "(ZLkotlin/jvm/functions/Function1;)V", "Companion", "tasks-provider-llm-prompt-velocity-model"})
/*     */   public static final class Classpath extends VelocityTemplateEngine {
/*     */     private Classpath(VelocityEngine velocityEngine) {
/*     */       super(velocityEngine, null);
/*     */       this.velocityEngine = velocityEngine;
/*     */     }
/*     */     
/*     */     @Deprecated(message = "Possible exception in constructor", replaceWith = @ReplaceWith(expression = "Classpath.create()", imports = {}))
/*     */     public Classpath(boolean enableTracing, @NotNull Function1 configureVelocityEngine) {
/*     */       this(VelocityTemplateEngine.Companion.configureVelocityEngine(enableTracing, (Function1)VelocityTemplateEngine.Companion.combine((Function1<? super T, Unit>[])arrayOfFunction1)));
/*     */     }
/*     */     
/*     */     private static final Unit _init_$lambda$0(VelocityEngine <this>) {
/*     */       Intrinsics.checkNotNullParameter(<this>, "<this>");
/*     */       return Unit.INSTANCE;
/*     */     }
/*     */     
/*     */     @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\002\020\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\002\b\002\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J-\020\t\032\0020\n2\b\b\002\020\013\032\0020\f2\031\b\002\020\r\032\023\022\004\022\0020\006\022\004\022\0020\0070\005¢\006\002\b\bH\007R\037\020\004\032\023\022\004\022\0020\006\022\004\022\0020\0070\005¢\006\002\b\bX\004¢\006\002\n\000¨\006\016"}, d2 = {"Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityTemplateEngine$Classpath$Companion;", "", "<init>", "()V", "classpathDefaults", "Lkotlin/Function1;", "Lorg/apache/velocity/app/VelocityEngine;", "", "Lkotlin/ExtensionFunctionType;", "create", "Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityTemplateEngine$Classpath;", "enableTracing", "", "configureVelocityEngine", "tasks-provider-llm-prompt-velocity-model"})
/*     */     public static final class Companion {
/*     */       private Companion() {}
/*     */       
/*     */       private static final Unit create$lambda$0(VelocityEngine <this>) {
/*     */         Intrinsics.checkNotNullParameter(<this>, "<this>");
/*     */         return Unit.INSTANCE;
/*     */       }
/*     */       
/*     */       @JvmStatic
/*     */       @NotNull
/*     */       public final VelocityTemplateEngine.Classpath create(boolean enableTracing, @NotNull Function1 configureVelocityEngine) {
/*     */         Intrinsics.checkNotNullParameter(configureVelocityEngine, "configureVelocityEngine");
/*     */         Function1[] arrayOfFunction1 = new Function1[2];
/*     */         arrayOfFunction1[0] = VelocityTemplateEngine.Classpath.classpathDefaults;
/*     */         arrayOfFunction1[1] = configureVelocityEngine;
/*     */         VelocityEngine velocityEngine = VelocityTemplateEngine.Companion.configureVelocityEngine(enableTracing, (Function1)VelocityTemplateEngine.Companion.combine((Function1<? super T, Unit>[])arrayOfFunction1));
/*     */         return new VelocityTemplateEngine.Classpath(velocityEngine, null);
/*     */       }
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public static final Companion Companion = new Companion(null);
/*     */     @NotNull
/*     */     private final VelocityEngine velocityEngine;
/*     */     @NotNull
/*     */     private static final Function1<VelocityEngine, Unit> classpathDefaults = Classpath::classpathDefaults$lambda$1;
/*     */     
/*     */     private static final Unit classpathDefaults$lambda$1(VelocityEngine <this>) {
/*     */       Intrinsics.checkNotNullParameter(<this>, "<this>");
/*     */       <this>.setProperty("resource.loaders", "classpath");
/*     */       <this>.setProperty("resource.loader.classpath.class", ClasspathResourceLoader.class.getName());
/*     */       <this>.setProperty("velocimacro.library.path", "tasksLibrary/.library/macros/library.vm");
/*     */       return Unit.INSTANCE;
/*     */     }
/*     */     
/*     */     @JvmStatic
/*     */     @NotNull
/*     */     public static final Classpath create(boolean enableTracing, @NotNull Function1<? super VelocityEngine, Unit> configureVelocityEngine) {
/*     */       return Companion.create(enableTracing, configureVelocityEngine);
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\0006\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\013\n\000\n\002\030\002\n\002\020\002\n\002\030\002\n\002\b\002\n\002\020\016\n\002\b\004\030\000 \0232\0020\001:\001\023B\031\b\002\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007B6\b\027\022\006\020\004\032\0020\005\022\b\b\002\020\b\032\0020\t\022\031\b\002\020\n\032\023\022\004\022\0020\003\022\004\022\0020\f0\013¢\006\002\b\r¢\006\004\b\006\020\016J\020\020\017\032\0020\0202\006\020\021\032\0020\020H\024J\b\020\022\032\0020\020H\026R\016\020\002\032\0020\003X\004¢\006\002\n\000R\016\020\004\032\0020\005X\004¢\006\002\n\000¨\006\024"}, d2 = {"Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityTemplateEngine$Relative;", "Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityTemplateEngine;", "velocityEngine", "Lorg/apache/velocity/app/VelocityEngine;", "templateDir", "Ljava/nio/file/Path;", "<init>", "(Lorg/apache/velocity/app/VelocityEngine;Ljava/nio/file/Path;)V", "enableTracing", "", "configureVelocityEngine", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "(Ljava/nio/file/Path;ZLkotlin/jvm/functions/Function1;)V", "adjustTemplatePath", "", "templatePath", "toString", "Companion", "tasks-provider-llm-prompt-velocity-model"})
/*     */   public static final class Relative extends VelocityTemplateEngine {
/*     */     @NotNull
/*     */     public static final Companion Companion = new Companion(null);
/*     */     @NotNull
/*     */     private final VelocityEngine velocityEngine;
/*     */     @NotNull
/*     */     private final Path templateDir;
/*     */     
/*     */     private Relative(VelocityEngine velocityEngine, Path templateDir) {
/*     */       super(velocityEngine, null);
/*     */       this.velocityEngine = velocityEngine;
/*     */       this.templateDir = templateDir;
/*     */     }
/*     */     
/*     */     private static final Unit _init_$lambda$0(VelocityEngine <this>) {
/*     */       Intrinsics.checkNotNullParameter(<this>, "<this>");
/*     */       return Unit.INSTANCE;
/*     */     }
/*     */     
/*     */     @Deprecated(message = "Possible exception in constructor", replaceWith = @ReplaceWith(expression = "Relative.create()", imports = {}))
/*     */     public Relative(@NotNull Path templateDir, boolean enableTracing, @NotNull Function1 configureVelocityEngine) {
/*     */       this(VelocityTemplateEngine.Companion.configureVelocityEngine(enableTracing, (Function1)VelocityTemplateEngine.Companion.combine((Function1<? super T, Unit>[])arrayOfFunction1)), templateDir);
/*     */     }
/*     */     
/*     */     @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\0002\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\002\020\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\002\b\002\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J!\020\004\032\023\022\004\022\0020\006\022\004\022\0020\0070\005¢\006\002\b\b2\006\020\t\032\0020\nH\002J5\020\013\032\0020\f2\006\020\t\032\0020\n2\b\b\002\020\r\032\0020\0162\031\b\002\020\017\032\023\022\004\022\0020\006\022\004\022\0020\0070\005¢\006\002\b\bH\007¨\006\020"}, d2 = {"Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityTemplateEngine$Relative$Companion;", "", "<init>", "()V", "fileDefaults", "Lkotlin/Function1;", "Lorg/apache/velocity/app/VelocityEngine;", "", "Lkotlin/ExtensionFunctionType;", "templateDir", "Ljava/nio/file/Path;", "create", "Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityTemplateEngine$Relative;", "enableTracing", "", "configureVelocityEngine", "tasks-provider-llm-prompt-velocity-model"})
/*     */     public static final class Companion {
/*     */       private Companion() {}
/*     */       
/*     */       private final Function1<VelocityEngine, Unit> fileDefaults(Path templateDir) {
/*     */         return templateDir::fileDefaults$lambda$0;
/*     */       }
/*     */       
/*     */       private static final Unit fileDefaults$lambda$0(Path $templateDir, VelocityEngine <this>) {
/*     */         Intrinsics.checkNotNullParameter(<this>, "<this>");
/*     */         <this>.setProperty("resource.loaders", "file");
/*     */         <this>.setProperty("resource.loader.file.class", FileResourceLoader.class.getName());
/*     */         <this>.setProperty("resource.loader.file.path", $templateDir.toString());
/*     */         <this>.setProperty("velocimacro.library.path", ".library/macros/library.vm");
/*     */         return Unit.INSTANCE;
/*     */       }
/*     */       
/*     */       private static final Unit create$lambda$1(VelocityEngine <this>) {
/*     */         Intrinsics.checkNotNullParameter(<this>, "<this>");
/*     */         return Unit.INSTANCE;
/*     */       }
/*     */       
/*     */       @JvmStatic
/*     */       @NotNull
/*     */       public final VelocityTemplateEngine.Relative create(@NotNull Path templateDir, boolean enableTracing, @NotNull Function1 configureVelocityEngine) {
/*     */         Intrinsics.checkNotNullParameter(templateDir, "templateDir");
/*     */         Intrinsics.checkNotNullParameter(configureVelocityEngine, "configureVelocityEngine");
/*     */         Function1[] arrayOfFunction1 = new Function1[2];
/*     */         arrayOfFunction1[0] = fileDefaults(templateDir);
/*     */         arrayOfFunction1[1] = configureVelocityEngine;
/*     */         VelocityEngine velocityEngine = VelocityTemplateEngine.Companion.configureVelocityEngine(enableTracing, (Function1)VelocityTemplateEngine.Companion.combine((Function1<? super T, Unit>[])arrayOfFunction1));
/*     */         return new VelocityTemplateEngine.Relative(velocityEngine, templateDir, null);
/*     */       }
/*     */     }
/*     */     
/*     */     @JvmStatic
/*     */     @NotNull
/*     */     public static final Relative create(@NotNull Path templateDir, boolean enableTracing, @NotNull Function1<? super VelocityEngine, Unit> configureVelocityEngine) {
/*     */       return Companion.create(templateDir, enableTracing, configureVelocityEngine);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     protected String adjustTemplatePath(@NotNull String templatePath) {
/*     */       Intrinsics.checkNotNullParameter(templatePath, "templatePath");
/*     */       Path path = this.templateDir.getFileSystem().getPath(templatePath, new String[0]);
/*     */       if (!path.isAbsolute())
/*     */         return path.toString(); 
/*     */       return this.templateDir.relativize(path).toString();
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public String toString() {
/*     */       return "VelocityTemplateEngine.Relative(" + this.templateDir + ")";
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\tasks-provider-llm-prompt-velocity-model-0.4.32.jar!\ai\grazie\tasks\provider\prompt\velocity\resources\lib\VelocityTemplateEngine.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */