/*     */ package ai.grazie.tasks.provider.prompt.velocity.resources.lib;
/*     */ 
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.JvmStatic;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.apache.velocity.app.VelocityEngine;
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
/*     */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\002\020\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\002\b\002\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J-\020\t\032\0020\n2\b\b\002\020\013\032\0020\f2\031\b\002\020\r\032\023\022\004\022\0020\006\022\004\022\0020\0070\005¢\006\002\b\bH\007R\037\020\004\032\023\022\004\022\0020\006\022\004\022\0020\0070\005¢\006\002\b\bX\004¢\006\002\n\000¨\006\016"}, d2 = {"Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityTemplateEngine$Classpath$Companion;", "", "<init>", "()V", "classpathDefaults", "Lkotlin/Function1;", "Lorg/apache/velocity/app/VelocityEngine;", "", "Lkotlin/ExtensionFunctionType;", "create", "Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityTemplateEngine$Classpath;", "enableTracing", "", "configureVelocityEngine", "tasks-provider-llm-prompt-velocity-model"})
/*     */ public final class Companion
/*     */ {
/*     */   private Companion() {}
/*     */   
/*     */   private static final Unit create$lambda$0(VelocityEngine <this>) {
/* 105 */     Intrinsics.checkNotNullParameter(<this>, "<this>"); return Unit.INSTANCE; } @JvmStatic @NotNull
/* 106 */   public final VelocityTemplateEngine.Classpath create(boolean enableTracing, @NotNull Function1 configureVelocityEngine) { Intrinsics.checkNotNullParameter(configureVelocityEngine, "configureVelocityEngine"); Function1[] arrayOfFunction1 = new Function1[2]; arrayOfFunction1[0] = VelocityTemplateEngine.Classpath.access$getClasspathDefaults$cp(); arrayOfFunction1[1] = configureVelocityEngine; VelocityEngine velocityEngine = VelocityTemplateEngine.Companion.configureVelocityEngine(enableTracing, VelocityTemplateEngine.Companion.access$combine(VelocityTemplateEngine.Companion, arrayOfFunction1));
/* 107 */     return new VelocityTemplateEngine.Classpath(velocityEngine, null); }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\tasks-provider-llm-prompt-velocity-model-0.4.32.jar!\ai\grazie\tasks\provider\prompt\velocity\resources\lib\VelocityTemplateEngine$Classpath$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */