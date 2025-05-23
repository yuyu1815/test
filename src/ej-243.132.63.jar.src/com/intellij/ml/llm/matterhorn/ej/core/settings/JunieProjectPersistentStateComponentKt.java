/*    */ package com.intellij.ml.llm.matterhorn.ej.core.settings;
/*    */ 
/*    */ import com.intellij.openapi.project.Project;
/*    */ import java.nio.file.Path;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.annotations.NotNull;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000\016\n\000\n\002\030\002\n\002\030\002\n\002\b\003\"\025\020\000\032\0020\001*\0020\0028F¢\006\006\032\004\b\003\020\004¨\006\005"}, d2 = {"junieProjectPath", "Ljava/nio/file/Path;", "Lcom/intellij/openapi/project/Project;", "getJunieProjectPath", "(Lcom/intellij/openapi/project/Project;)Ljava/nio/file/Path;", "ej-core"})
/*    */ @SourceDebugExtension({"SMAP\nJunieProjectPersistentStateComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JunieProjectPersistentStateComponent.kt\ncom/intellij/ml/llm/matterhorn/ej/core/settings/JunieProjectPersistentStateComponentKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,58:1\n1#2:59\n*E\n"})
/*    */ public final class JunieProjectPersistentStateComponentKt
/*    */ {
/*    */   @NotNull
/*    */   public static final Path getJunieProjectPath(@NotNull Project $this$junieProjectPath) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: ldc '<this>'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: getstatic com/intellij/ml/llm/matterhorn/ej/core/settings/JunieProjectPersistentStateComponent.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/settings/JunieProjectPersistentStateComponent$Companion;
/*    */     //   9: aload_0
/*    */     //   10: invokevirtual getInstance : (Lcom/intellij/openapi/project/Project;)Lcom/intellij/ml/llm/matterhorn/ej/core/settings/JunieProjectPersistentStateComponent;
/*    */     //   13: invokevirtual getState : ()Lcom/intellij/openapi/components/BaseState;
/*    */     //   16: checkcast com/intellij/ml/llm/matterhorn/ej/core/settings/JunieProjectState
/*    */     //   19: astore_1
/*    */     //   20: aload_1
/*    */     //   21: invokevirtual getProjectPath : ()Ljava/lang/String;
/*    */     //   24: astore_2
/*    */     //   25: aload_0
/*    */     //   26: invokestatic guessProjectDir : (Lcom/intellij/openapi/project/Project;)Lcom/intellij/openapi/vfs/VirtualFile;
/*    */     //   29: dup
/*    */     //   30: ifnull -> 55
/*    */     //   33: astore #7
/*    */     //   35: iconst_0
/*    */     //   36: istore #8
/*    */     //   38: aload #7
/*    */     //   40: invokevirtual getPath : ()Ljava/lang/String;
/*    */     //   43: iconst_0
/*    */     //   44: anewarray java/lang/String
/*    */     //   47: invokestatic get : (Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;
/*    */     //   50: nop
/*    */     //   51: dup
/*    */     //   52: ifnonnull -> 106
/*    */     //   55: pop
/*    */     //   56: aload_0
/*    */     //   57: invokeinterface getBasePath : ()Ljava/lang/String;
/*    */     //   62: dup
/*    */     //   63: ifnull -> 84
/*    */     //   66: astore #9
/*    */     //   68: iconst_0
/*    */     //   69: istore #10
/*    */     //   71: aload #9
/*    */     //   73: iconst_0
/*    */     //   74: anewarray java/lang/String
/*    */     //   77: invokestatic get : (Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;
/*    */     //   80: nop
/*    */     //   81: goto -> 86
/*    */     //   84: pop
/*    */     //   85: aconst_null
/*    */     //   86: dup
/*    */     //   87: ifnonnull -> 106
/*    */     //   90: pop
/*    */     //   91: ldc '.'
/*    */     //   93: iconst_0
/*    */     //   94: anewarray java/lang/String
/*    */     //   97: invokestatic get : (Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;
/*    */     //   100: dup
/*    */     //   101: ldc 'get(...)'
/*    */     //   103: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   106: astore_3
/*    */     //   107: aload_2
/*    */     //   108: checkcast java/lang/CharSequence
/*    */     //   111: astore #4
/*    */     //   113: aload #4
/*    */     //   115: ifnull -> 126
/*    */     //   118: aload #4
/*    */     //   120: invokestatic isBlank : (Ljava/lang/CharSequence;)Z
/*    */     //   123: ifeq -> 130
/*    */     //   126: iconst_1
/*    */     //   127: goto -> 131
/*    */     //   130: iconst_0
/*    */     //   131: ifne -> 219
/*    */     //   134: nop
/*    */     //   135: aload_2
/*    */     //   136: iconst_0
/*    */     //   137: anewarray java/lang/String
/*    */     //   140: invokestatic get : (Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;
/*    */     //   143: astore #5
/*    */     //   145: aload #5
/*    */     //   147: invokeinterface isAbsolute : ()Z
/*    */     //   152: ifeq -> 160
/*    */     //   155: aload #5
/*    */     //   157: goto -> 168
/*    */     //   160: aload_3
/*    */     //   161: aload #5
/*    */     //   163: invokeinterface resolve : (Ljava/nio/file/Path;)Ljava/nio/file/Path;
/*    */     //   168: astore #5
/*    */     //   170: goto -> 201
/*    */     //   173: astore #6
/*    */     //   175: getstatic com/intellij/ml/llm/matterhorn/ej/core/settings/JunieProjectPersistentStateComponent.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/settings/JunieProjectPersistentStateComponent$Companion;
/*    */     //   178: invokevirtual getLogger$ej_core : ()Lcom/intellij/openapi/diagnostic/Logger;
/*    */     //   181: aload_2
/*    */     //   182: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*    */     //   187: aload #6
/*    */     //   189: checkcast java/lang/Throwable
/*    */     //   192: invokevirtual error : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*    */     //   195: aload_3
/*    */     //   196: invokestatic _get_junieProjectPath_$defaultPath : (Ljava/nio/file/Path;)Ljava/nio/file/Path;
/*    */     //   199: astore #5
/*    */     //   201: aload #5
/*    */     //   203: astore #4
/*    */     //   205: aload #4
/*    */     //   207: invokeinterface normalize : ()Ljava/nio/file/Path;
/*    */     //   212: dup
/*    */     //   213: ldc 'normalize(...)'
/*    */     //   215: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   218: areturn
/*    */     //   219: getstatic com/intellij/ml/llm/matterhorn/ej/core/settings/JunieProjectPersistentStateComponent.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/settings/JunieProjectPersistentStateComponent$Companion;
/*    */     //   222: invokevirtual getLogger$ej_core : ()Lcom/intellij/openapi/diagnostic/Logger;
/*    */     //   225: ldc 'Junie project path not set in state; using project directory'
/*    */     //   227: invokevirtual warn : (Ljava/lang/String;)V
/*    */     //   230: aload_3
/*    */     //   231: invokestatic _get_junieProjectPath_$defaultPath : (Ljava/nio/file/Path;)Ljava/nio/file/Path;
/*    */     //   234: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #30	-> 6
/*    */     //   #31	-> 9
/*    */     //   #32	-> 13
/*    */     //   #30	-> 19
/*    */     //   #33	-> 20
/*    */     //   #36	-> 25
/*    */     //   #59	-> 35
/*    */     //   #36	-> 38
/*    */     //   #36	-> 50
/*    */     //   #36	-> 51
/*    */     //   #37	-> 55
/*    */     //   #59	-> 68
/*    */     //   #37	-> 71
/*    */     //   #37	-> 80
/*    */     //   #37	-> 81
/*    */     //   #36	-> 86
/*    */     //   #38	-> 91
/*    */     //   #36	-> 106
/*    */     //   #42	-> 107
/*    */     //   #42	-> 131
/*    */     //   #43	-> 134
/*    */     //   #44	-> 135
/*    */     //   #45	-> 145
/*    */     //   #46	-> 173
/*    */     //   #47	-> 175
/*    */     //   #48	-> 181
/*    */     //   #49	-> 187
/*    */     //   #47	-> 192
/*    */     //   #51	-> 195
/*    */     //   #43	-> 201
/*    */     //   #53	-> 205
/*    */     //   #56	-> 219
/*    */     //   #57	-> 230
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   38	12	8	$i$a$-let-JunieProjectPersistentStateComponentKt$junieProjectPath$projectDirPath$1	I
/*    */     //   35	15	7	it	Lcom/intellij/openapi/vfs/VirtualFile;
/*    */     //   71	9	10	$i$a$-let-JunieProjectPersistentStateComponentKt$junieProjectPath$projectDirPath$2	I
/*    */     //   68	12	9	it	Ljava/lang/String;
/*    */     //   145	23	5	candidate	Ljava/nio/file/Path;
/*    */     //   175	26	6	e	Ljava/lang/Exception;
/*    */     //   205	14	4	path	Ljava/nio/file/Path;
/*    */     //   20	215	1	settingsState	Lcom/intellij/ml/llm/matterhorn/ej/core/settings/JunieProjectState;
/*    */     //   25	210	2	stored	Ljava/lang/String;
/*    */     //   107	128	3	projectDirPath	Ljava/nio/file/Path;
/*    */     //   0	235	0	$this$junieProjectPath	Lcom/intellij/openapi/project/Project;
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   134	170	173	java/lang/Exception
/*    */   }
/*    */   
/*    */   private static final Path _get_junieProjectPath_$defaultPath(Path projectDirPath) {
/* 40 */     return projectDirPath;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\settings\JunieProjectPersistentStateComponentKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */