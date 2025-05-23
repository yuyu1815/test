/*    */ package com.intellij.ml.llm.matterhorn.ej.core;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.run.ExecutionMode;
/*    */ import com.intellij.openapi.components.Service;
/*    */ import com.intellij.openapi.components.SimplePersistentStateComponent;
/*    */ import com.intellij.openapi.diagnostic.Logger;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Service({Service.Level.PROJECT})
/*    */ @State(name = "MatterhornSettings", storages = {@Storage("MatterhornSettings.xml")})
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\004\n\002\020\016\n\002\b\002\b\007\030\000 \f2\b\022\004\022\0020\0020\001:\001\fB\007¢\006\004\b\003\020\004J\022\020\t\032\004\030\0010\0062\006\020\n\032\0020\013H\002R\021\020\005\032\0020\0068F¢\006\006\032\004\b\007\020\b¨\006\r"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/MatterhornPersistentStateComponent;", "Lcom/intellij/openapi/components/SimplePersistentStateComponent;", "Lcom/intellij/ml/llm/matterhorn/ej/core/MatterhornState;", "<init>", "()V", "effectiveExecutionMode", "Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionMode;", "getEffectiveExecutionMode", "()Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionMode;", "findExecutionModeOrWarn", "id", "", "Companion", "ej-core"})
/*    */ @SourceDebugExtension({"SMAP\nMatterhornPersistentStateComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MatterhornPersistentStateComponent.kt\ncom/intellij/ml/llm/matterhorn/ej/core/MatterhornPersistentStateComponent\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n*L\n1#1,30:1\n1#2:31\n14#3:32\n*S KotlinDebug\n*F\n+ 1 MatterhornPersistentStateComponent.kt\ncom/intellij/ml/llm/matterhorn/ej/core/MatterhornPersistentStateComponent\n*L\n19#1:32\n*E\n"})
/*    */ public final class MatterhornPersistentStateComponent extends SimplePersistentStateComponent<MatterhornState> {
/* 17 */   public MatterhornPersistentStateComponent() { super(new MatterhornState()); }
/*    */    @NotNull
/* 19 */   public static final Companion Companion = new Companion(null); @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\n\002\020\016\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\016\020\004\032\0020\005X\004¢\006\002\n\000R\016\020\006\032\0020\007XT¢\006\002\n\000¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/MatterhornPersistentStateComponent$Companion;", "", "<init>", "()V", "logger", "Lcom/intellij/openapi/diagnostic/Logger;", "MATTERHORN_EXECUTION_MODE_ENV_VAR_NAME", "", "ej-core"}) public static final class Companion { private Companion() {} } static { int $i$f$logger = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 32 */     Intrinsics.checkNotNullExpressionValue(Logger.getInstance(MatterhornPersistentStateComponent.class), "getInstance(...)"); } @NotNull private static final Logger logger = Logger.getInstance(MatterhornPersistentStateComponent.class);
/*    */   
/*    */   @NotNull
/*    */   public final ExecutionMode getEffectiveExecutionMode() {
/*    */     // Byte code:
/*    */     //   0: ldc 'MATTERHORN_EXECUTION_MODE'
/*    */     //   2: invokestatic getenv : (Ljava/lang/String;)Ljava/lang/String;
/*    */     //   5: dup
/*    */     //   6: ifnull -> 22
/*    */     //   9: astore_1
/*    */     //   10: iconst_0
/*    */     //   11: istore_2
/*    */     //   12: aload_0
/*    */     //   13: aload_1
/*    */     //   14: invokespecial findExecutionModeOrWarn : (Ljava/lang/String;)Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionMode;
/*    */     //   17: nop
/*    */     //   18: dup
/*    */     //   19: ifnonnull -> 66
/*    */     //   22: pop
/*    */     //   23: aload_0
/*    */     //   24: invokevirtual getState : ()Lcom/intellij/openapi/components/BaseState;
/*    */     //   27: checkcast com/intellij/ml/llm/matterhorn/ej/core/MatterhornState
/*    */     //   30: invokevirtual getExecutionMode : ()Ljava/lang/String;
/*    */     //   33: dup
/*    */     //   34: ifnull -> 50
/*    */     //   37: astore_3
/*    */     //   38: iconst_0
/*    */     //   39: istore #4
/*    */     //   41: aload_0
/*    */     //   42: aload_3
/*    */     //   43: invokespecial findExecutionModeOrWarn : (Ljava/lang/String;)Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionMode;
/*    */     //   46: nop
/*    */     //   47: goto -> 52
/*    */     //   50: pop
/*    */     //   51: aconst_null
/*    */     //   52: dup
/*    */     //   53: ifnonnull -> 66
/*    */     //   56: pop
/*    */     //   57: getstatic com/intellij/ml/llm/matterhorn/ej/core/run/ExecutionMode.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionMode$Companion;
/*    */     //   60: invokevirtual getDefault : ()Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionMode$UnsafeLocal;
/*    */     //   63: checkcast com/intellij/ml/llm/matterhorn/ej/core/run/ExecutionMode
/*    */     //   66: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #24	-> 0
/*    */     //   #31	-> 10
/*    */     //   #24	-> 12
/*    */     //   #24	-> 17
/*    */     //   #24	-> 18
/*    */     //   #25	-> 22
/*    */     //   #31	-> 38
/*    */     //   #25	-> 41
/*    */     //   #25	-> 46
/*    */     //   #25	-> 47
/*    */     //   #24	-> 52
/*    */     //   #26	-> 57
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   12	5	2	$i$a$-let-MatterhornPersistentStateComponent$effectiveExecutionMode$1	I
/*    */     //   10	7	1	it	Ljava/lang/String;
/*    */     //   41	5	4	$i$a$-let-MatterhornPersistentStateComponent$effectiveExecutionMode$2	I
/*    */     //   38	8	3	it	Ljava/lang/String;
/*    */     //   0	67	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/MatterhornPersistentStateComponent;
/*    */   }
/*    */   
/*    */   private final ExecutionMode findExecutionModeOrWarn(String id) {
/*    */     if (ExecutionMode.Companion.find(id) == null) {
/*    */       ExecutionMode.Companion.find(id);
/*    */       ExecutionMode executionMode1 = null, it = executionMode1;
/*    */       int $i$a$-also-MatterhornPersistentStateComponent$findExecutionModeOrWarn$1 = 0;
/*    */       logger.warn("Invalid value of " + id);
/*    */     } 
/*    */     return executionMode1;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   private static final String MATTERHORN_EXECUTION_MODE_ENV_VAR_NAME = "MATTERHORN_EXECUTION_MODE";
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\MatterhornPersistentStateComponent.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */