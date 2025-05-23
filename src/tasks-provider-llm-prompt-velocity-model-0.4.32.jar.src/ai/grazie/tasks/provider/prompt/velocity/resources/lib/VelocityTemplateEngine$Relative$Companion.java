/*     */ package ai.grazie.tasks.provider.prompt.velocity.resources.lib;
/*     */ 
/*     */ import java.nio.file.Path;
/*     */ import kotlin.Metadata;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\0002\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\002\020\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\002\b\002\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J!\020\004\032\023\022\004\022\0020\006\022\004\022\0020\0070\005¢\006\002\b\b2\006\020\t\032\0020\nH\002J5\020\013\032\0020\f2\006\020\t\032\0020\n2\b\b\002\020\r\032\0020\0162\031\b\002\020\017\032\023\022\004\022\0020\006\022\004\022\0020\0070\005¢\006\002\b\bH\007¨\006\020"}, d2 = {"Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityTemplateEngine$Relative$Companion;", "", "<init>", "()V", "fileDefaults", "Lkotlin/Function1;", "Lorg/apache/velocity/app/VelocityEngine;", "", "Lkotlin/ExtensionFunctionType;", "templateDir", "Ljava/nio/file/Path;", "create", "Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityTemplateEngine$Relative;", "enableTracing", "", "configureVelocityEngine", "tasks-provider-llm-prompt-velocity-model"})
/*     */ public final class Companion
/*     */ {
/*     */   private Companion() {}
/*     */   
/*     */   private final Function1<VelocityEngine, Unit> fileDefaults(Path templateDir) {
/* 127 */     return templateDir::fileDefaults$lambda$0; } private static final Unit fileDefaults$lambda$0(Path $templateDir, VelocityEngine <this>) {
/* 128 */     Intrinsics.checkNotNullParameter(<this>, "<this>"); <this>.setProperty("resource.loaders", "file");
/* 129 */     <this>.setProperty("resource.loader.file.class", FileResourceLoader.class.getName());
/* 130 */     <this>.setProperty("resource.loader.file.path", $templateDir.toString());
/* 131 */     <this>.setProperty("velocimacro.library.path", ".library/macros/library.vm");
/* 132 */     return Unit.INSTANCE;
/*     */   }
/*     */   
/* 135 */   private static final Unit create$lambda$1(VelocityEngine <this>) { Intrinsics.checkNotNullParameter(<this>, "<this>"); return Unit.INSTANCE; } @JvmStatic @NotNull
/* 136 */   public final VelocityTemplateEngine.Relative create(@NotNull Path templateDir, boolean enableTracing, @NotNull Function1 configureVelocityEngine) { Intrinsics.checkNotNullParameter(templateDir, "templateDir"); Intrinsics.checkNotNullParameter(configureVelocityEngine, "configureVelocityEngine"); Function1[] arrayOfFunction1 = new Function1[2]; arrayOfFunction1[0] = fileDefaults(templateDir); arrayOfFunction1[1] = configureVelocityEngine; VelocityEngine velocityEngine = VelocityTemplateEngine.Companion.configureVelocityEngine(enableTracing, VelocityTemplateEngine.Companion.access$combine(VelocityTemplateEngine.Companion, arrayOfFunction1));
/* 137 */     return new VelocityTemplateEngine.Relative(velocityEngine, templateDir, null); }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\tasks-provider-llm-prompt-velocity-model-0.4.32.jar!\ai\grazie\tasks\provider\prompt\velocity\resources\lib\VelocityTemplateEngine$Relative$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */