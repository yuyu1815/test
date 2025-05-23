/*     */ package ai.grazie.tasks.provider.prompt.velocity.resources.lib;
/*     */ 
/*     */ import ai.grazie.tasks.provider.prompt.velocity.resources.lib.validation.UtilsKt;
/*     */ import java.net.URI;
/*     */ import java.nio.file.FileSystem;
/*     */ import java.nio.file.Paths;
/*     */ import kotlin.KotlinNothingValueException;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Result;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.io.CloseableKt;
/*     */ import kotlin.jvm.JvmStatic;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.apache.velocity.app.VelocityEngine;
/*     */ import org.apache.velocity.app.event.implement.IncludeRelativePath;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000@\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\000\n\002\030\002\n\002\030\002\n\002\020\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\b\004\b\003\030\0002\0020\001:\001\027B\t\b\002¢\006\004\b\002\020\003J1\020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\0132\027\020\f\032\023\022\004\022\0020\016\022\004\022\0020\0170\r¢\006\002\b\020H\007JZ\020\021\032\023\022\004\022\002H\022\022\004\022\0020\0170\r¢\006\002\b\020\"\004\b\000\020\02224\020\023\032\033\022\027\b\001\022\023\022\004\022\002H\022\022\004\022\0020\0170\r¢\006\002\b\0200\024\"\023\022\004\022\002H\022\022\004\022\0020\0170\r¢\006\002\b\020H\002¢\006\002\020\025J)\020\f\032\0020\0162\b\b\002\020\n\032\0020\0132\027\020\026\032\023\022\004\022\0020\016\022\004\022\0020\0170\r¢\006\002\b\020R\016\020\004\032\0020\005XT¢\006\002\n\000¨\006\030"}, d2 = {"Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityTemplateEngine$Companion;", "", "<init>", "()V", "NEWLINE", "", "create", "Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityTemplateEngine;", "rootUri", "Ljava/net/URI;", "enableTracing", "", "configureVelocityEngine", "Lkotlin/Function1;", "Lorg/apache/velocity/app/VelocityEngine;", "", "Lkotlin/ExtensionFunctionType;", "combine", "T", "blocks", "", "([Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function1;", "customConfig", "Tools", "tasks-provider-llm-prompt-velocity-model"})
/*     */ @SourceDebugExtension({"SMAP\nVelocityTemplateEngine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VelocityTemplateEngine.kt\nai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityTemplateEngine$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,160:1\n13402#2,2:161\n*S KotlinDebug\n*F\n+ 1 VelocityTemplateEngine.kt\nai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityTemplateEngine$Companion\n*L\n51#1:161,2\n*E\n"})
/*     */ public final class Companion
/*     */ {
/*     */   private Companion() {}
/*     */   
/*     */   @JvmStatic
/*     */   @NotNull
/*     */   public final VelocityTemplateEngine create(@NotNull URI rootUri, boolean enableTracing, @NotNull Function1<? super VelocityEngine, Unit> configureVelocityEngine) {
/*  32 */     Intrinsics.checkNotNullParameter(rootUri, "rootUri"); Intrinsics.checkNotNullParameter(configureVelocityEngine, "configureVelocityEngine"); String str = rootUri.getScheme();
/*  33 */     FileSystem fileSystem = VelocityTemplateEngineKt.getFileSystem(rootUri); Throwable throwable = null; try { FileSystem it = fileSystem; int $i$a$-use-VelocityTemplateEngine$Companion$create$1 = 0; VelocityTemplateEngine.Classpath classpath = 
/*  34 */         VelocityTemplateEngine.Classpath.Companion.create(
/*  35 */           enableTracing, 
/*  36 */           configureVelocityEngine); }
/*     */     catch (Throwable throwable1) { throwable = throwable1 = null; throw throwable1; }
/*     */     finally { CloseableKt.closeFinally(fileSystem, throwable); }
/*  39 */      if (Intrinsics.areEqual(str, "file")) {
/*     */       
/*  41 */       Intrinsics.checkNotNullExpressionValue(Paths.get(rootUri), "get(...)");
/*     */     
/*     */     }
/*     */     else {
/*     */       
/*  46 */       UtilsKt.velocityLibraryException$default("Unsupported root URI scheme: " + rootUri.getScheme(), null, 2, null); throw new KotlinNothingValueException();
/*     */     } 
/*     */     return Intrinsics.areEqual(str, "jar") ? classpath : (VelocityTemplateEngine)"JD-Core does not support Kotlin";
/*     */   } @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\016\n\002\b\002\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\016\020\004\032\0020\005XT¢\006\002\n\000R\016\020\006\032\0020\005XT¢\006\002\n\000¨\006\007"}, d2 = {"Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityTemplateEngine$Companion$Tools;", "", "<init>", "()V", "YAML_ESCAPING", "", "JSON_ESCAPING", "tasks-provider-llm-prompt-velocity-model"}) public static final class Tools { @NotNull public static final Tools INSTANCE = new Tools(); @NotNull public static final String YAML_ESCAPING = "yamlEscapingTool"; @NotNull
/*  50 */     public static final String JSON_ESCAPING = "jsonEscapingTool"; } private final <T> Function1<T, Unit> combine(Function1... blocks) { return blocks::combine$lambda$2; } private static final Unit combine$lambda$2(Function1[] $blocks, Object <this>) {
/*  51 */     Function1[] arrayOfFunction1 = $blocks; int $i$f$forEach = 0;
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
/* 161 */     byte b = 0; int i = arrayOfFunction1.length; if (b < i) { Object element$iv = arrayOfFunction1[b], object1 = element$iv; int $i$a$-forEach-VelocityTemplateEngine$Companion$combine$1$1 = 0;
/*     */       object1.invoke(<this>); }
/*     */     
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final VelocityEngine configureVelocityEngine(boolean enableTracing, @NotNull Function1 customConfig) {
/*     */     Object object2;
/*     */     Intrinsics.checkNotNullParameter(customConfig, "customConfig");
/*     */     VelocityEngine velocityEngine1 = new VelocityEngine(), $this$configureVelocityEngine_u24lambda_u245 = velocityEngine1;
/*     */     int $i$a$-apply-VelocityTemplateEngine$Companion$configureVelocityEngine$1 = 0;
/*     */     $this$configureVelocityEngine_u24lambda_u245.setProperty("parser.space_gobbling", "STRUCTURED");
/*     */     $this$configureVelocityEngine_u24lambda_u245.setProperty("runtime.strict_mode.enable", Boolean.valueOf(true));
/*     */     $this$configureVelocityEngine_u24lambda_u245.setProperty("event_handler.include.class", IncludeRelativePath.class.getName());
/*     */     $this$configureVelocityEngine_u24lambda_u245.setProperty("runtime.custom_directives", "ai.grazie.tasks.provider.prompt.velocity.resources.utils.ErrorDirective");
/*     */     if (enableTracing)
/*     */       $this$configureVelocityEngine_u24lambda_u245.setProperty("runtime.log.track_location", Boolean.valueOf(true)); 
/*     */     customConfig.invoke($this$configureVelocityEngine_u24lambda_u245);
/*     */     VelocityEngine velocityEngine2 = $this$configureVelocityEngine_u24lambda_u245;
/*     */     try {
/*     */       VelocityEngine $this$configureVelocityEngine_u24lambda_u245_u24lambda_u243 = velocityEngine2;
/*     */       int $i$a$-runCatching-VelocityTemplateEngine$Companion$configureVelocityEngine$1$1 = 0;
/*     */       $this$configureVelocityEngine_u24lambda_u245_u24lambda_u243.init();
/*     */       object2 = Result.constructor-impl(Unit.INSTANCE);
/*     */     } catch (Throwable throwable) {
/*     */       object2 = Result.constructor-impl(ResultKt.createFailure(throwable));
/*     */     } 
/*     */     Object object1 = object2;
/*     */     if (Result.exceptionOrNull-impl(object1) == null) {
/*     */       Result.exceptionOrNull-impl(object1);
/*     */     } else {
/*     */       Throwable it;
/*     */       int $i$a$-getOrElse-VelocityTemplateEngine$Companion$configureVelocityEngine$1$2 = 0;
/*     */       throw new VelocityLibraryException("Failed to initialize VelocityEngine", it);
/*     */     } 
/*     */     return velocityEngine1;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\tasks-provider-llm-prompt-velocity-model-0.4.32.jar!\ai\grazie\tasks\provider\prompt\velocity\resources\lib\VelocityTemplateEngine$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */