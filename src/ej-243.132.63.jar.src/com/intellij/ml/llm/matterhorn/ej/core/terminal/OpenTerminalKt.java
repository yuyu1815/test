/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal;
/*    */ import com.intellij.openapi.fileEditor.FileEditor;
/*    */ import com.intellij.openapi.util.Key;
/*    */ import com.intellij.openapi.vfs.VirtualFile;
/*    */ import com.intellij.util.concurrency.annotations.RequiresEdt;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000.\n\000\n\002\030\002\n\002\020\016\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\013\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\032\030\020\003\032\0020\0042\006\020\005\032\0020\0022\006\020\006\032\0020\007H\001\032\024\020\b\032\0020\t*\0020\n2\006\020\005\032\0020\002H\002\032\026\020\013\032\004\030\0010\f*\0020\r2\006\020\005\032\0020\002H\000\"\024\020\000\032\b\022\004\022\0020\0020\001X\004¢\006\002\n\000¨\006\016"}, d2 = {"JUNIE_SHELL_EXECUTOR_ID", "Lcom/intellij/openapi/util/Key;", "", "openTerminalEditor", "Lcom/intellij/openapi/fileEditor/FileEditor;", "executorUuid", "widget", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/TerminalWidgetImpl;", "isForExecutor", "", "Lcom/intellij/openapi/vfs/VirtualFile;", "findTerminalEditor", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/JunieTerminalSessionEditor;", "Lcom/intellij/openapi/project/Project;", "ej-core"})
/*    */ @SourceDebugExtension({"SMAP\nopenTerminal.kt\nKotlin\n*S Kotlin\n*F\n+ 1 openTerminal.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/OpenTerminalKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,106:1\n1310#2,2:107\n1310#2,2:109\n*S KotlinDebug\n*F\n+ 1 openTerminal.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/OpenTerminalKt\n*L\n22#1:107,2\n44#1:109,2\n*E\n"})
/*    */ public final class OpenTerminalKt {
/*    */   @NotNull
/* 16 */   private static final Key<String> JUNIE_SHELL_EXECUTOR_ID = Key.create("JUNIE_SHELL_EXECUTOR_ID"); static { Intrinsics.checkNotNullExpressionValue(Key.create("JUNIE_SHELL_EXECUTOR_ID"), "create(...)"); }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @RequiresEdt
/*    */   @NotNull
/*    */   public static final FileEditor openTerminalEditor(@NotNull String executorUuid, @NotNull TerminalWidgetImpl widget) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: ldc 'executorUuid'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_1
/*    */     //   7: ldc 'widget'
/*    */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   12: aload_1
/*    */     //   13: invokevirtual getProject : ()Lcom/intellij/openapi/project/Project;
/*    */     //   16: astore_2
/*    */     //   17: aload_2
/*    */     //   18: invokestatic getInstance : (Lcom/intellij/openapi/project/Project;)Lcom/intellij/openapi/fileEditor/FileEditorManager;
/*    */     //   21: astore_3
/*    */     //   22: aload_3
/*    */     //   23: invokevirtual getOpenFiles : ()[Lcom/intellij/openapi/vfs/VirtualFile;
/*    */     //   26: dup
/*    */     //   27: ldc 'getOpenFiles(...)'
/*    */     //   29: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   32: checkcast [Ljava/lang/Object;
/*    */     //   35: astore #5
/*    */     //   37: iconst_0
/*    */     //   38: istore #6
/*    */     //   40: iconst_0
/*    */     //   41: istore #7
/*    */     //   43: aload #5
/*    */     //   45: arraylength
/*    */     //   46: istore #8
/*    */     //   48: iload #7
/*    */     //   50: iload #8
/*    */     //   52: if_icmpge -> 97
/*    */     //   55: aload #5
/*    */     //   57: iload #7
/*    */     //   59: aaload
/*    */     //   60: astore #9
/*    */     //   62: aload #9
/*    */     //   64: checkcast com/intellij/openapi/vfs/VirtualFile
/*    */     //   67: astore #10
/*    */     //   69: iconst_0
/*    */     //   70: istore #11
/*    */     //   72: aload #10
/*    */     //   74: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*    */     //   77: aload #10
/*    */     //   79: aload_0
/*    */     //   80: invokestatic isForExecutor : (Lcom/intellij/openapi/vfs/VirtualFile;Ljava/lang/String;)Z
/*    */     //   83: ifeq -> 91
/*    */     //   86: aload #9
/*    */     //   88: goto -> 98
/*    */     //   91: iinc #7, 1
/*    */     //   94: goto -> 48
/*    */     //   97: aconst_null
/*    */     //   98: checkcast com/intellij/openapi/vfs/VirtualFile
/*    */     //   101: astore #4
/*    */     //   103: aload #4
/*    */     //   105: ifnull -> 137
/*    */     //   108: aload_3
/*    */     //   109: aload #4
/*    */     //   111: iconst_1
/*    */     //   112: invokevirtual openFile : (Lcom/intellij/openapi/vfs/VirtualFile;Z)[Lcom/intellij/openapi/fileEditor/FileEditor;
/*    */     //   115: dup
/*    */     //   116: ldc 'openFile(...)'
/*    */     //   118: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   121: checkcast [Ljava/lang/Object;
/*    */     //   124: invokestatic first : ([Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   127: dup
/*    */     //   128: ldc 'first(...)'
/*    */     //   130: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   133: checkcast com/intellij/openapi/fileEditor/FileEditor
/*    */     //   136: areturn
/*    */     //   137: new org/jetbrains/plugins/terminal/vfs/TerminalSessionVirtualFileImpl
/*    */     //   140: dup
/*    */     //   141: ldc 'Junie Terminal'
/*    */     //   143: aload_1
/*    */     //   144: checkcast com/intellij/terminal/ui/TerminalWidget
/*    */     //   147: aload_1
/*    */     //   148: invokevirtual getSettings : ()Lorg/jetbrains/plugins/terminal/JBTerminalSystemSettingsProvider;
/*    */     //   151: checkcast com/jediterm/terminal/ui/settings/SettingsProvider
/*    */     //   154: invokespecial <init> : (Ljava/lang/String;Lcom/intellij/terminal/ui/TerminalWidget;Lcom/jediterm/terminal/ui/settings/SettingsProvider;)V
/*    */     //   157: astore #5
/*    */     //   159: aload #5
/*    */     //   161: iconst_0
/*    */     //   162: invokevirtual setWritable : (Z)V
/*    */     //   165: aload #5
/*    */     //   167: getstatic com/intellij/ml/llm/matterhorn/ej/core/terminal/OpenTerminalKt.JUNIE_SHELL_EXECUTOR_ID : Lcom/intellij/openapi/util/Key;
/*    */     //   170: aload_0
/*    */     //   171: invokevirtual putUserData : (Lcom/intellij/openapi/util/Key;Ljava/lang/Object;)V
/*    */     //   174: aload #5
/*    */     //   176: getstatic com/intellij/openapi/fileEditor/FileEditorManagerKeys.CLOSING_TO_REOPEN : Lcom/intellij/openapi/util/Key;
/*    */     //   179: iconst_1
/*    */     //   180: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*    */     //   183: invokevirtual putUserData : (Lcom/intellij/openapi/util/Key;Ljava/lang/Object;)V
/*    */     //   186: aload_2
/*    */     //   187: invokestatic getInstance : (Lcom/intellij/openapi/project/Project;)Lcom/intellij/openapi/fileEditor/FileEditorManager;
/*    */     //   190: aload #5
/*    */     //   192: checkcast com/intellij/openapi/vfs/VirtualFile
/*    */     //   195: iconst_1
/*    */     //   196: invokevirtual openFile : (Lcom/intellij/openapi/vfs/VirtualFile;Z)[Lcom/intellij/openapi/fileEditor/FileEditor;
/*    */     //   199: dup
/*    */     //   200: ldc 'openFile(...)'
/*    */     //   202: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   205: checkcast [Ljava/lang/Object;
/*    */     //   208: invokestatic first : ([Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   211: checkcast com/intellij/openapi/fileEditor/FileEditor
/*    */     //   214: astore #6
/*    */     //   216: aload #5
/*    */     //   218: getstatic com/intellij/openapi/fileEditor/FileEditorManagerKeys.CLOSING_TO_REOPEN : Lcom/intellij/openapi/util/Key;
/*    */     //   221: aconst_null
/*    */     //   222: invokevirtual putUserData : (Lcom/intellij/openapi/util/Key;Ljava/lang/Object;)V
/*    */     //   225: aload #6
/*    */     //   227: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*    */     //   230: aload #6
/*    */     //   232: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #20	-> 12
/*    */     //   #21	-> 17
/*    */     //   #22	-> 22
/*    */     //   #107	-> 40
/*    */     //   #22	-> 72
/*    */     //   #107	-> 83
/*    */     //   #108	-> 97
/*    */     //   #22	-> 98
/*    */     //   #24	-> 103
/*    */     //   #25	-> 108
/*    */     //   #28	-> 137
/*    */     //   #29	-> 159
/*    */     //   #30	-> 165
/*    */     //   #32	-> 174
/*    */     //   #33	-> 186
/*    */     //   #34	-> 216
/*    */     //   #36	-> 225
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   72	11	11	$i$a$-firstOrNull-OpenTerminalKt$openTerminalEditor$existingFile$1	I
/*    */     //   69	14	10	it	Lcom/intellij/openapi/vfs/VirtualFile;
/*    */     //   62	29	9	element$iv	Ljava/lang/Object;
/*    */     //   40	58	6	$i$f$firstOrNull	I
/*    */     //   37	61	5	$this$firstOrNull$iv	[Ljava/lang/Object;
/*    */     //   17	216	2	project	Lcom/intellij/openapi/project/Project;
/*    */     //   22	211	3	manager	Lcom/intellij/openapi/fileEditor/FileEditorManager;
/*    */     //   103	130	4	existingFile	Lcom/intellij/openapi/vfs/VirtualFile;
/*    */     //   159	74	5	file	Lorg/jetbrains/plugins/terminal/vfs/TerminalSessionVirtualFileImpl;
/*    */     //   216	17	6	result	Lcom/intellij/openapi/fileEditor/FileEditor;
/*    */     //   0	233	0	executorUuid	Ljava/lang/String;
/*    */     //   0	233	1	widget	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/TerminalWidgetImpl;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private static final boolean isForExecutor(VirtualFile $this$isForExecutor, String executorUuid) {
/* 40 */     return Intrinsics.areEqual($this$isForExecutor.getUserData(JUNIE_SHELL_EXECUTOR_ID), executorUuid);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public static final JunieTerminalSessionEditor findTerminalEditor(@NotNull Project $this$findTerminalEditor, @NotNull String executorUuid) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: ldc '<this>'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_1
/*    */     //   7: ldc 'executorUuid'
/*    */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   12: aload_0
/*    */     //   13: invokestatic getInstance : (Lcom/intellij/openapi/project/Project;)Lcom/intellij/openapi/fileEditor/FileEditorManager;
/*    */     //   16: invokevirtual getAllEditors : ()[Lcom/intellij/openapi/fileEditor/FileEditor;
/*    */     //   19: dup
/*    */     //   20: ldc 'getAllEditors(...)'
/*    */     //   22: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   25: checkcast [Ljava/lang/Object;
/*    */     //   28: astore_3
/*    */     //   29: iconst_0
/*    */     //   30: istore #4
/*    */     //   32: iconst_0
/*    */     //   33: istore #5
/*    */     //   35: aload_3
/*    */     //   36: arraylength
/*    */     //   37: istore #6
/*    */     //   39: iload #5
/*    */     //   41: iload #6
/*    */     //   43: if_icmpge -> 93
/*    */     //   46: aload_3
/*    */     //   47: iload #5
/*    */     //   49: aaload
/*    */     //   50: astore #7
/*    */     //   52: aload #7
/*    */     //   54: checkcast com/intellij/openapi/fileEditor/FileEditor
/*    */     //   57: astore #8
/*    */     //   59: iconst_0
/*    */     //   60: istore #9
/*    */     //   62: aload #8
/*    */     //   64: invokeinterface getFile : ()Lcom/intellij/openapi/vfs/VirtualFile;
/*    */     //   69: dup
/*    */     //   70: ldc 'getFile(...)'
/*    */     //   72: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   75: aload_1
/*    */     //   76: invokestatic isForExecutor : (Lcom/intellij/openapi/vfs/VirtualFile;Ljava/lang/String;)Z
/*    */     //   79: ifeq -> 87
/*    */     //   82: aload #7
/*    */     //   84: goto -> 94
/*    */     //   87: iinc #5, 1
/*    */     //   90: goto -> 39
/*    */     //   93: aconst_null
/*    */     //   94: astore_2
/*    */     //   95: aload_2
/*    */     //   96: instanceof com/intellij/ml/llm/matterhorn/ej/core/terminal/JunieTerminalSessionEditor
/*    */     //   99: ifeq -> 109
/*    */     //   102: aload_2
/*    */     //   103: checkcast com/intellij/ml/llm/matterhorn/ej/core/terminal/JunieTerminalSessionEditor
/*    */     //   106: goto -> 110
/*    */     //   109: aconst_null
/*    */     //   110: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #44	-> 12
/*    */     //   #109	-> 32
/*    */     //   #45	-> 62
/*    */     //   #109	-> 79
/*    */     //   #110	-> 93
/*    */     //   #44	-> 94
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   62	17	9	$i$a$-firstOrNull-OpenTerminalKt$findTerminalEditor$1	I
/*    */     //   59	20	8	it	Lcom/intellij/openapi/fileEditor/FileEditor;
/*    */     //   52	35	7	element$iv	Ljava/lang/Object;
/*    */     //   32	62	4	$i$f$firstOrNull	I
/*    */     //   29	65	3	$this$firstOrNull$iv	[Ljava/lang/Object;
/*    */     //   0	111	0	$this$findTerminalEditor	Lcom/intellij/openapi/project/Project;
/*    */     //   0	111	1	executorUuid	Ljava/lang/String;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\OpenTerminalKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */