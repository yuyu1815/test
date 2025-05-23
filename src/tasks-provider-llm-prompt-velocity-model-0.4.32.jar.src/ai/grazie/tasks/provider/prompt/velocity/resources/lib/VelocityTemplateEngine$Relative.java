/*     */ package ai.grazie.tasks.provider.prompt.velocity.resources.lib;
/*     */ 
/*     */ import java.nio.file.Path;
/*     */ import kotlin.Deprecated;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ReplaceWith;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.JvmStatic;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.apache.velocity.app.VelocityEngine;
/*     */ import org.apache.velocity.runtime.resource.loader.FileResourceLoader;
/*     */ import org.jetbrains.annotations.NotNull;
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
/*     */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\0006\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\013\n\000\n\002\030\002\n\002\020\002\n\002\030\002\n\002\b\002\n\002\020\016\n\002\b\004\030\000 \0232\0020\001:\001\023B\031\b\002\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007B6\b\027\022\006\020\004\032\0020\005\022\b\b\002\020\b\032\0020\t\022\031\b\002\020\n\032\023\022\004\022\0020\003\022\004\022\0020\f0\013¢\006\002\b\r¢\006\004\b\006\020\016J\020\020\017\032\0020\0202\006\020\021\032\0020\020H\024J\b\020\022\032\0020\020H\026R\016\020\002\032\0020\003X\004¢\006\002\n\000R\016\020\004\032\0020\005X\004¢\006\002\n\000¨\006\024"}, d2 = {"Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityTemplateEngine$Relative;", "Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityTemplateEngine;", "velocityEngine", "Lorg/apache/velocity/app/VelocityEngine;", "templateDir", "Ljava/nio/file/Path;", "<init>", "(Lorg/apache/velocity/app/VelocityEngine;Ljava/nio/file/Path;)V", "enableTracing", "", "configureVelocityEngine", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "(Ljava/nio/file/Path;ZLkotlin/jvm/functions/Function1;)V", "adjustTemplatePath", "", "templatePath", "toString", "Companion", "tasks-provider-llm-prompt-velocity-model"})
/*     */ public final class Relative
/*     */   extends VelocityTemplateEngine
/*     */ {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   @NotNull
/*     */   private final VelocityEngine velocityEngine;
/*     */   @NotNull
/*     */   private final Path templateDir;
/*     */   
/*     */   private Relative(VelocityEngine velocityEngine, Path templateDir) {
/* 115 */     super(velocityEngine, null); this.velocityEngine = velocityEngine; this.templateDir = templateDir;
/*     */   }
/*     */ 
/*     */   
/*     */   private static final Unit _init_$lambda$0(VelocityEngine <this>) {
/* 120 */     Intrinsics.checkNotNullParameter(<this>, "<this>"); return Unit.INSTANCE; } @Deprecated(message = "Possible exception in constructor", replaceWith = @ReplaceWith(expression = "Relative.create()", imports = {}))
/* 121 */   public Relative(@NotNull Path templateDir, boolean enableTracing, @NotNull Function1 configureVelocityEngine) { this(
/* 122 */         VelocityTemplateEngine.Companion.configureVelocityEngine(enableTracing, VelocityTemplateEngine.Companion.access$combine(VelocityTemplateEngine.Companion, arrayOfFunction1)), 
/* 123 */         templateDir); }
/*     */    @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\0002\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\002\020\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\002\b\002\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J!\020\004\032\023\022\004\022\0020\006\022\004\022\0020\0070\005¢\006\002\b\b2\006\020\t\032\0020\nH\002J5\020\013\032\0020\f2\006\020\t\032\0020\n2\b\b\002\020\r\032\0020\0162\031\b\002\020\017\032\023\022\004\022\0020\006\022\004\022\0020\0070\005¢\006\002\b\bH\007¨\006\020"}, d2 = {"Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityTemplateEngine$Relative$Companion;", "", "<init>", "()V", "fileDefaults", "Lkotlin/Function1;", "Lorg/apache/velocity/app/VelocityEngine;", "", "Lkotlin/ExtensionFunctionType;", "templateDir", "Ljava/nio/file/Path;", "create", "Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityTemplateEngine$Relative;", "enableTracing", "", "configureVelocityEngine", "tasks-provider-llm-prompt-velocity-model"})
/*     */   public static final class Companion {
/*     */     private Companion() {}
/* 127 */     private final Function1<VelocityEngine, Unit> fileDefaults(Path templateDir) { return templateDir::fileDefaults$lambda$0; } private static final Unit fileDefaults$lambda$0(Path $templateDir, VelocityEngine <this>) {
/* 128 */       Intrinsics.checkNotNullParameter(<this>, "<this>"); <this>.setProperty("resource.loaders", "file");
/* 129 */       <this>.setProperty("resource.loader.file.class", FileResourceLoader.class.getName());
/* 130 */       <this>.setProperty("resource.loader.file.path", $templateDir.toString());
/* 131 */       <this>.setProperty("velocimacro.library.path", ".library/macros/library.vm");
/* 132 */       return Unit.INSTANCE;
/*     */     }
/*     */     
/* 135 */     private static final Unit create$lambda$1(VelocityEngine <this>) { Intrinsics.checkNotNullParameter(<this>, "<this>"); return Unit.INSTANCE; } @JvmStatic @NotNull
/* 136 */     public final VelocityTemplateEngine.Relative create(@NotNull Path templateDir, boolean enableTracing, @NotNull Function1 configureVelocityEngine) { Intrinsics.checkNotNullParameter(templateDir, "templateDir"); Intrinsics.checkNotNullParameter(configureVelocityEngine, "configureVelocityEngine"); Function1[] arrayOfFunction1 = new Function1[2]; arrayOfFunction1[0] = fileDefaults(templateDir); arrayOfFunction1[1] = configureVelocityEngine; VelocityEngine velocityEngine = VelocityTemplateEngine.Companion.configureVelocityEngine(enableTracing, VelocityTemplateEngine.Companion.access$combine(VelocityTemplateEngine.Companion, arrayOfFunction1));
/* 137 */       return new VelocityTemplateEngine.Relative(velocityEngine, templateDir, null); } } @JvmStatic @NotNull
/* 138 */   public static final Relative create(@NotNull Path templateDir, boolean enableTracing, @NotNull Function1<? super VelocityEngine, Unit> configureVelocityEngine) { return Companion.create(templateDir, enableTracing, configureVelocityEngine); }
/*     */   
/*     */   @NotNull
/*     */   protected String adjustTemplatePath(@NotNull String templatePath) {
/* 142 */     Intrinsics.checkNotNullParameter(templatePath, "templatePath"); Path path = this.templateDir.getFileSystem().getPath(templatePath, new String[0]);
/* 143 */     if (!path.isAbsolute()) {
/* 144 */       return path.toString();
/*     */     }
/* 146 */     return this.templateDir.relativize(path).toString();
/*     */   }
/*     */   @NotNull
/*     */   public String toString() {
/* 150 */     return "VelocityTemplateEngine.Relative(" + this.templateDir + ")";
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\tasks-provider-llm-prompt-velocity-model-0.4.32.jar!\ai\grazie\tasks\provider\prompt\velocity\resources\lib\VelocityTemplateEngine$Relative.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */