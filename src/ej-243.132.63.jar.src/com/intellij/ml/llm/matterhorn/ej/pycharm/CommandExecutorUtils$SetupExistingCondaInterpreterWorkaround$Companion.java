package com.intellij.ml.llm.matterhorn.ej.pycharm;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\016\n\002\b\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\b\020\007\032\004\030\0010\bR\016\020\004\032\0020\005XT¢\006\002\n\000R\016\020\006\032\0020\005XT¢\006\002\n\000¨\006\t"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/pycharm/CommandExecutorUtils$SetupExistingCondaInterpreterWorkaround$Companion;", "", "<init>", "()V", "CONDA_BINARIES_ENV_VAR", "", "CONDA_ENV_NAME_ENV_VAR", "fromEnvironment", "Lcom/intellij/ml/llm/matterhorn/ej/pycharm/CommandExecutorUtils$SetupExistingCondaInterpreterWorkaround;", "ej-pycharm"})
@SourceDebugExtension({"SMAP\nCommandExecutorUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommandExecutorUtils.kt\ncom/intellij/ml/llm/matterhorn/ej/pycharm/CommandExecutorUtils$SetupExistingCondaInterpreterWorkaround$Companion\n+ 2 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n*L\n1#1,171:1\n61#2,5:172\n*S KotlinDebug\n*F\n+ 1 CommandExecutorUtils.kt\ncom/intellij/ml/llm/matterhorn/ej/pycharm/CommandExecutorUtils$SetupExistingCondaInterpreterWorkaround$Companion\n*L\n109#1:172,5\n*E\n"})
public final class Companion {
  private Companion() {}
  
  @Nullable
  public final CommandExecutorUtils.SetupExistingCondaInterpreterWorkaround fromEnvironment() {
    // Byte code:
    //   0: ldc 'CONDA_BINARIES'
    //   2: invokestatic getenv : (Ljava/lang/String;)Ljava/lang/String;
    //   5: astore_1
    //   6: ldc 'CONDA_ENV_NAME'
    //   8: invokestatic getenv : (Ljava/lang/String;)Ljava/lang/String;
    //   11: astore_2
    //   12: getstatic com/intellij/ml/llm/matterhorn/ej/pycharm/CommandExecutorUtils.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/pycharm/CommandExecutorUtils;
    //   15: invokestatic access$getLOG : (Lcom/intellij/ml/llm/matterhorn/ej/pycharm/CommandExecutorUtils;)Lcom/intellij/openapi/diagnostic/Logger;
    //   18: astore_3
    //   19: aconst_null
    //   20: astore #4
    //   22: iconst_0
    //   23: istore #5
    //   25: aload_3
    //   26: invokevirtual isDebugEnabled : ()Z
    //   29: ifeq -> 53
    //   32: aload_3
    //   33: astore #7
    //   35: iconst_0
    //   36: istore #6
    //   38: aload_1
    //   39: aload_2
    //   40: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   45: aload #7
    //   47: swap
    //   48: aload #4
    //   50: invokevirtual debug : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   53: nop
    //   54: aload_1
    //   55: ifnull -> 62
    //   58: aload_2
    //   59: ifnonnull -> 64
    //   62: aconst_null
    //   63: areturn
    //   64: new com/intellij/ml/llm/matterhorn/ej/pycharm/CommandExecutorUtils$SetupExistingCondaInterpreterWorkaround
    //   67: dup
    //   68: aload_1
    //   69: aload_2
    //   70: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;)V
    //   73: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #106	-> 0
    //   #107	-> 6
    //   #109	-> 12
    //   #172	-> 19
    //   #173	-> 25
    //   #174	-> 32
    //   #110	-> 38
    //   #174	-> 48
    //   #176	-> 53
    //   #113	-> 54
    //   #115	-> 64
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   38	7	6	$i$a$-debug$default-CommandExecutorUtils$SetupExistingCondaInterpreterWorkaround$Companion$fromEnvironment$1	I
    //   25	29	5	$i$f$debug	I
    //   19	35	3	$this$debug_u24default$iv	Lcom/intellij/openapi/diagnostic/Logger;
    //   22	32	4	e$iv	Ljava/lang/Exception;
    //   6	68	1	condaBinaries	Ljava/lang/String;
    //   12	62	2	condaEnvName	Ljava/lang/String;
    //   0	74	0	this	Lcom/intellij/ml/llm/matterhorn/ej/pycharm/CommandExecutorUtils$SetupExistingCondaInterpreterWorkaround$Companion;
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\pycharm\CommandExecutorUtils$SetupExistingCondaInterpreterWorkaround$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */