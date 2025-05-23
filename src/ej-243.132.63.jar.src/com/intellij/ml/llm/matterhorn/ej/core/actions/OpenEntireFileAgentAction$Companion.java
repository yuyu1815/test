package com.intellij.ml.llm.matterhorn.ej.core.actions;

import com.intellij.ml.llm.matterhorn.ej.core.ExecutionAgentContext;
import com.intellij.openapi.vfs.VirtualFile;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\016\n\000\n\002\020\b\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\036\020\b\032\0020\0052\006\020\t\032\0020\n2\006\020\013\032\0020\fH@¢\006\002\020\rR\016\020\004\032\0020\005XT¢\006\002\n\000R\016\020\006\032\0020\007XT¢\006\002\n\000¨\006\016"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/OpenEntireFileAgentAction$Companion;", "", "<init>", "()V", "PATH_ARGUMENT", "", "OPEN_FULL_FILE_LIMIT", "", "openEntireFile", "vFile", "Lcom/intellij/openapi/vfs/VirtualFile;", "context", "Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;", "(Lcom/intellij/openapi/vfs/VirtualFile;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ej-core"})
public final class Companion {
  private Companion() {}
  
  @Nullable
  public final Object openEntireFile(@NotNull VirtualFile vFile, @NotNull ExecutionAgentContext context, @NotNull Continuation $completion) {
    // Byte code:
    //   0: aload_3
    //   1: instanceof com/intellij/ml/llm/matterhorn/ej/core/actions/OpenEntireFileAgentAction$Companion$openEntireFile$1
    //   4: ifeq -> 39
    //   7: aload_3
    //   8: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/OpenEntireFileAgentAction$Companion$openEntireFile$1
    //   11: astore #9
    //   13: aload #9
    //   15: getfield label : I
    //   18: ldc -2147483648
    //   20: iand
    //   21: ifeq -> 39
    //   24: aload #9
    //   26: dup
    //   27: getfield label : I
    //   30: ldc -2147483648
    //   32: isub
    //   33: putfield label : I
    //   36: goto -> 50
    //   39: new com/intellij/ml/llm/matterhorn/ej/core/actions/OpenEntireFileAgentAction$Companion$openEntireFile$1
    //   42: dup
    //   43: aload_0
    //   44: aload_3
    //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/actions/OpenEntireFileAgentAction$Companion;Lkotlin/coroutines/Continuation;)V
    //   48: astore #9
    //   50: aload #9
    //   52: getfield result : Ljava/lang/Object;
    //   55: astore #8
    //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   60: astore #10
    //   62: aload #9
    //   64: getfield label : I
    //   67: tableswitch default -> 416, 0 -> 96, 1 -> 202, 2 -> 315, 3 -> 408
    //   96: aload #8
    //   98: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   101: aload_1
    //   102: invokevirtual getName : ()Ljava/lang/String;
    //   105: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
    //   110: getstatic com/intellij/ml/llm/matterhorn/ej/core/StepType.Info : Lcom/intellij/ml/llm/matterhorn/ej/core/StepType;
    //   113: aload_2
    //   114: invokestatic emitMetadata : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/StepType;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;)V
    //   117: aload_1
    //   118: invokestatic toNioPathOrNull : (Lcom/intellij/openapi/vfs/VirtualFile;)Ljava/nio/file/Path;
    //   121: dup
    //   122: ifnonnull -> 129
    //   125: pop
    //   126: ldc 'ERROR: file path is invalid.'
    //   128: areturn
    //   129: astore #4
    //   131: new com/intellij/ml/llm/matterhorn/HumanInLoopAction$ActionTouchingFile
    //   134: dup
    //   135: aload #4
    //   137: ldc 'Open'
    //   139: invokespecial <init> : (Ljava/nio/file/Path;Ljava/lang/String;)V
    //   142: astore #5
    //   144: aload_2
    //   145: invokeinterface getExecutionContext : ()Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
    //   150: invokevirtual getRoot : ()Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;
    //   153: invokevirtual getHumanInLoop : ()Lcom/intellij/ml/llm/matterhorn/HumanInLoop;
    //   156: aload #5
    //   158: checkcast com/intellij/ml/llm/matterhorn/HumanInLoopAction
    //   161: aload #9
    //   163: aload #9
    //   165: aload_1
    //   166: putfield L$0 : Ljava/lang/Object;
    //   169: aload #9
    //   171: aload_2
    //   172: putfield L$1 : Ljava/lang/Object;
    //   175: aload #9
    //   177: aload #4
    //   179: putfield L$2 : Ljava/lang/Object;
    //   182: aload #9
    //   184: iconst_1
    //   185: putfield label : I
    //   188: invokeinterface shouldAllowAction : (Lcom/intellij/ml/llm/matterhorn/HumanInLoopAction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   193: dup
    //   194: aload #10
    //   196: if_acmpne -> 237
    //   199: aload #10
    //   201: areturn
    //   202: aload #9
    //   204: getfield L$2 : Ljava/lang/Object;
    //   207: checkcast java/nio/file/Path
    //   210: astore #4
    //   212: aload #9
    //   214: getfield L$1 : Ljava/lang/Object;
    //   217: checkcast com/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext
    //   220: astore_2
    //   221: aload #9
    //   223: getfield L$0 : Ljava/lang/Object;
    //   226: checkcast com/intellij/openapi/vfs/VirtualFile
    //   229: astore_1
    //   230: aload #8
    //   232: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   235: aload #8
    //   237: getstatic com/intellij/ml/llm/matterhorn/HumanInLoopResponse$Agree.INSTANCE : Lcom/intellij/ml/llm/matterhorn/HumanInLoopResponse$Agree;
    //   240: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   243: ifne -> 254
    //   246: aload #4
    //   248: <illegal opcode> makeConcatWithConstants : (Ljava/nio/file/Path;)Ljava/lang/String;
    //   253: areturn
    //   254: aload_2
    //   255: new com/intellij/ml/llm/matterhorn/ej/core/FileWithLine
    //   258: dup
    //   259: aload_1
    //   260: iconst_1
    //   261: invokespecial <init> : (Lcom/intellij/openapi/vfs/VirtualFile;I)V
    //   264: invokeinterface setCurrentScreenPosition : (Lcom/intellij/ml/llm/matterhorn/ej/core/FileWithLine;)V
    //   269: aload_2
    //   270: aload_1
    //   271: aload #4
    //   273: iconst_1
    //   274: sipush #1500
    //   277: aload #9
    //   279: aload #9
    //   281: aload_1
    //   282: putfield L$0 : Ljava/lang/Object;
    //   285: aload #9
    //   287: aload_2
    //   288: putfield L$1 : Ljava/lang/Object;
    //   291: aload #9
    //   293: aconst_null
    //   294: putfield L$2 : Ljava/lang/Object;
    //   297: aload #9
    //   299: iconst_2
    //   300: putfield label : I
    //   303: invokestatic oncePerSessionShowFileToAgent : (Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Lcom/intellij/openapi/vfs/VirtualFile;Ljava/nio/file/Path;ZILkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   306: dup
    //   307: aload #10
    //   309: if_acmpne -> 340
    //   312: aload #10
    //   314: areturn
    //   315: aload #9
    //   317: getfield L$1 : Ljava/lang/Object;
    //   320: checkcast com/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext
    //   323: astore_2
    //   324: aload #9
    //   326: getfield L$0 : Ljava/lang/Object;
    //   329: checkcast com/intellij/openapi/vfs/VirtualFile
    //   332: astore_1
    //   333: aload #8
    //   335: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   338: aload #8
    //   340: checkcast java/lang/String
    //   343: dup
    //   344: ifnull -> 355
    //   347: astore #6
    //   349: iconst_0
    //   350: istore #7
    //   352: aload #6
    //   354: areturn
    //   355: pop
    //   356: aload_2
    //   357: invokeinterface getProject : ()Lcom/intellij/openapi/project/Project;
    //   362: aload_1
    //   363: iconst_1
    //   364: bipush #100
    //   366: aconst_null
    //   367: aload_2
    //   368: invokeinterface getSessionHistory : ()Lcom/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistory;
    //   373: aload #9
    //   375: bipush #16
    //   377: aconst_null
    //   378: aload #9
    //   380: aconst_null
    //   381: putfield L$0 : Ljava/lang/Object;
    //   384: aload #9
    //   386: aconst_null
    //   387: putfield L$1 : Ljava/lang/Object;
    //   390: aload #9
    //   392: iconst_3
    //   393: putfield label : I
    //   396: invokestatic printScreen$default : (Lcom/intellij/openapi/project/Project;Lcom/intellij/openapi/vfs/VirtualFile;IILjava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistory;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
    //   399: dup
    //   400: aload #10
    //   402: if_acmpne -> 415
    //   405: aload #10
    //   407: areturn
    //   408: aload #8
    //   410: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   413: aload #8
    //   415: areturn
    //   416: new java/lang/IllegalStateException
    //   419: dup
    //   420: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   422: invokespecial <init> : (Ljava/lang/String;)V
    //   425: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #17	-> 60
    //   #18	-> 101
    //   #20	-> 117
    //   #22	-> 131
    //   #23	-> 144
    //   #17	-> 199
    //   #23	-> 237
    //   #24	-> 246
    //   #27	-> 254
    //   #28	-> 269
    //   #17	-> 312
    //   #28	-> 340
    //   #29	-> 352
    //   #32	-> 356
    //   #17	-> 405
    //   #32	-> 415
    //   #17	-> 416
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   101	101	1	vFile	Lcom/intellij/openapi/vfs/VirtualFile;
    //   230	85	1	vFile	Lcom/intellij/openapi/vfs/VirtualFile;
    //   333	14	1	vFile	Lcom/intellij/openapi/vfs/VirtualFile;
    //   355	44	1	vFile	Lcom/intellij/openapi/vfs/VirtualFile;
    //   101	101	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
    //   221	94	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
    //   324	23	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
    //   355	44	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
    //   131	71	4	filePath	Ljava/nio/file/Path;
    //   212	42	4	filePath	Ljava/nio/file/Path;
    //   254	52	4	filePath	Ljava/nio/file/Path;
    //   144	49	5	action	Lcom/intellij/ml/llm/matterhorn/HumanInLoopAction$ActionTouchingFile;
    //   349	6	6	it	Ljava/lang/String;
    //   352	3	7	$i$a$-let-OpenEntireFileAgentAction$Companion$openEntireFile$2	I
    //   0	426	3	$completion	Lkotlin/coroutines/Continuation;
    //   50	366	9	$continuation	Lkotlin/coroutines/Continuation;
    //   57	359	8	$result	Ljava/lang/Object;
  }
  
  @DebugMetadata(f = "OpenEntireFileAgentAction.kt", l = {23, 28, 32}, i = {0, 0, 0, 1, 1}, s = {"L$0", "L$1", "L$2", "L$0", "L$1"}, n = {"vFile", "context", "filePath", "vFile", "context"}, m = "openEntireFile", c = "com.intellij.ml.llm.matterhorn.ej.core.actions.OpenEntireFileAgentAction$Companion")
  @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
  static final class OpenEntireFileAgentAction$Companion$openEntireFile$1 extends ContinuationImpl {
    Object L$0;
    
    Object L$1;
    
    Object L$2;
    
    int label;
    
    OpenEntireFileAgentAction$Companion$openEntireFile$1(Continuation $completion) {
      super($completion);
    }
    
    @Nullable
    public final Object invokeSuspend(@NotNull Object $result) {
      this.result = $result;
      this.label |= Integer.MIN_VALUE;
      return OpenEntireFileAgentAction.Companion.this.openEntireFile(null, null, (Continuation<? super String>)this);
    }
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\actions\OpenEntireFileAgentAction$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */