package com.intellij.ml.llm.matterhorn.ej.core.history_processors;

import com.intellij.ml.llm.matterhorn.ExecutionContext;
import com.intellij.ml.llm.matterhorn.ej.core.AgentObservation;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\016\n\000\n\002\030\002\n\002\b\002\n\002\020 \n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\026\020\004\032\0020\0052\006\020\006\032\0020\007H@¢\006\002\020\bJ*\020\t\032\b\022\004\022\0020\0130\n2\f\020\f\032\b\022\004\022\0020\0130\n2\006\020\006\032\0020\007H@¢\006\002\020\r¨\006\016"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/AddStepsInfo$Companion;", "", "<init>", "()V", "getStepsInformation", "", "context", "Lcom/intellij/ml/llm/matterhorn/ExecutionContext;", "(Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addStepsInfo", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentObservation;", "observations", "(Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ej-core"})
@SourceDebugExtension({"SMAP\nAddStepsInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddStepsInfo.kt\ncom/intellij/ml/llm/matterhorn/ej/core/history_processors/AddStepsInfo$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,64:1\n1734#2,3:65\n*S KotlinDebug\n*F\n+ 1 AddStepsInfo.kt\ncom/intellij/ml/llm/matterhorn/ej/core/history_processors/AddStepsInfo$Companion\n*L\n55#1:65,3\n*E\n"})
public final class Companion {
  private Companion() {}
  
  @Nullable
  public final Object getStepsInformation(@NotNull ExecutionContext context, @NotNull Continuation $completion) {
    // Byte code:
    //   0: aload_2
    //   1: instanceof com/intellij/ml/llm/matterhorn/ej/core/history_processors/AddStepsInfo$Companion$getStepsInformation$1
    //   4: ifeq -> 39
    //   7: aload_2
    //   8: checkcast com/intellij/ml/llm/matterhorn/ej/core/history_processors/AddStepsInfo$Companion$getStepsInformation$1
    //   11: astore #6
    //   13: aload #6
    //   15: getfield label : I
    //   18: ldc -2147483648
    //   20: iand
    //   21: ifeq -> 39
    //   24: aload #6
    //   26: dup
    //   27: getfield label : I
    //   30: ldc -2147483648
    //   32: isub
    //   33: putfield label : I
    //   36: goto -> 50
    //   39: new com/intellij/ml/llm/matterhorn/ej/core/history_processors/AddStepsInfo$Companion$getStepsInformation$1
    //   42: dup
    //   43: aload_0
    //   44: aload_2
    //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/AddStepsInfo$Companion;Lkotlin/coroutines/Continuation;)V
    //   48: astore #6
    //   50: aload #6
    //   52: getfield result : Ljava/lang/Object;
    //   55: astore #5
    //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   60: astore #7
    //   62: aload #6
    //   64: getfield label : I
    //   67: tableswitch default -> 195, 0 -> 88, 1 -> 146
    //   88: aload #5
    //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   93: getstatic com/intellij/ml/llm/matterhorn/ej/core/ElectricJuniorSupportProvider.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/ElectricJuniorSupportProvider$Companion;
    //   96: aload_1
    //   97: invokevirtual getProject : ()Lcom/intellij/openapi/project/Project;
    //   100: invokevirtual getSupport : (Lcom/intellij/openapi/project/Project;)Lcom/intellij/ml/llm/matterhorn/ej/core/ElectricJuniorSupport;
    //   103: astore_3
    //   104: aload_3
    //   105: getstatic com/intellij/ml/llm/matterhorn/ej/core/IssueType.ISSUE : Lcom/intellij/ml/llm/matterhorn/ej/core/IssueType;
    //   108: invokeinterface getIssueWorker : (Lcom/intellij/ml/llm/matterhorn/ej/core/IssueType;)Lcom/intellij/ml/llm/matterhorn/ej/core/AbstractIssueAgentWorker;
    //   113: aload_1
    //   114: invokevirtual getRoot : ()Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;
    //   117: invokevirtual getPropertyProvider : ()Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
    //   120: aload #6
    //   122: aload #6
    //   124: aload_1
    //   125: putfield L$0 : Ljava/lang/Object;
    //   128: aload #6
    //   130: iconst_1
    //   131: putfield label : I
    //   134: invokevirtual getAgentParameters : (Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   137: dup
    //   138: aload #7
    //   140: if_acmpne -> 162
    //   143: aload #7
    //   145: areturn
    //   146: aload #6
    //   148: getfield L$0 : Ljava/lang/Object;
    //   151: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
    //   154: astore_1
    //   155: aload #5
    //   157: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   160: aload #5
    //   162: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentParameters
    //   165: invokevirtual getMaxSteps : ()I
    //   168: istore #4
    //   170: iload #4
    //   172: aload_1
    //   173: invokevirtual getParent : ()Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
    //   176: dup
    //   177: invokestatic checkNotNull : (Ljava/lang/Object;)V
    //   180: invokevirtual getArtifact : ()Lcom/intellij/ml/llm/matterhorn/ArtifactId;
    //   183: invokevirtual getName : ()Ljava/lang/String;
    //   186: <illegal opcode> makeConcatWithConstants : (ILjava/lang/String;)Ljava/lang/String;
    //   191: invokestatic trimIndent : (Ljava/lang/String;)Ljava/lang/String;
    //   194: areturn
    //   195: new java/lang/IllegalStateException
    //   198: dup
    //   199: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   201: invokespecial <init> : (Ljava/lang/String;)V
    //   204: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #40	-> 60
    //   #41	-> 93
    //   #43	-> 104
    //   #40	-> 143
    //   #43	-> 162
    //   #42	-> 168
    //   #45	-> 170
    //   #47	-> 191
    //   #44	-> 194
    //   #40	-> 195
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   93	53	1	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
    //   155	40	1	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
    //   104	33	3	ejSupport	Lcom/intellij/ml/llm/matterhorn/ej/core/ElectricJuniorSupport;
    //   170	25	4	maxSteps	I
    //   0	205	2	$completion	Lkotlin/coroutines/Continuation;
    //   50	145	6	$continuation	Lkotlin/coroutines/Continuation;
    //   57	138	5	$result	Ljava/lang/Object;
  }
  
  @Nullable
  public final Object addStepsInfo(@NotNull List observations, @NotNull ExecutionContext context, @NotNull Continuation $completion) {
    // Byte code:
    //   0: aload_3
    //   1: instanceof com/intellij/ml/llm/matterhorn/ej/core/history_processors/AddStepsInfo$Companion$addStepsInfo$1
    //   4: ifeq -> 39
    //   7: aload_3
    //   8: checkcast com/intellij/ml/llm/matterhorn/ej/core/history_processors/AddStepsInfo$Companion$addStepsInfo$1
    //   11: astore #11
    //   13: aload #11
    //   15: getfield label : I
    //   18: ldc -2147483648
    //   20: iand
    //   21: ifeq -> 39
    //   24: aload #11
    //   26: dup
    //   27: getfield label : I
    //   30: ldc -2147483648
    //   32: isub
    //   33: putfield label : I
    //   36: goto -> 50
    //   39: new com/intellij/ml/llm/matterhorn/ej/core/history_processors/AddStepsInfo$Companion$addStepsInfo$1
    //   42: dup
    //   43: aload_0
    //   44: aload_3
    //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/AddStepsInfo$Companion;Lkotlin/coroutines/Continuation;)V
    //   48: astore #11
    //   50: aload #11
    //   52: getfield result : Ljava/lang/Object;
    //   55: astore #10
    //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   60: astore #18
    //   62: aload #11
    //   64: getfield label : I
    //   67: tableswitch default -> 421, 0 -> 88, 1 -> 305
    //   88: aload #10
    //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   93: aload_1
    //   94: invokestatic last : (Ljava/util/List;)Ljava/lang/Object;
    //   97: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentObservation
    //   100: invokevirtual getElement : ()Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;
    //   103: invokeinterface getKind : ()Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind;
    //   108: getstatic com/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind.User : Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind;
    //   111: if_acmpne -> 118
    //   114: iconst_1
    //   115: goto -> 119
    //   118: iconst_0
    //   119: istore #4
    //   121: getstatic kotlin/_Assertions.ENABLED : Z
    //   124: ifeq -> 146
    //   127: iload #4
    //   129: ifne -> 146
    //   132: ldc 'Assertion failed'
    //   134: astore #5
    //   136: new java/lang/AssertionError
    //   139: dup
    //   140: aload #5
    //   142: invokespecial <init> : (Ljava/lang/Object;)V
    //   145: athrow
    //   146: aload_1
    //   147: checkcast java/lang/Iterable
    //   150: astore #4
    //   152: iconst_0
    //   153: istore #5
    //   155: aload #4
    //   157: instanceof java/util/Collection
    //   160: ifeq -> 180
    //   163: aload #4
    //   165: checkcast java/util/Collection
    //   168: invokeinterface isEmpty : ()Z
    //   173: ifeq -> 180
    //   176: iconst_1
    //   177: goto -> 234
    //   180: aload #4
    //   182: invokeinterface iterator : ()Ljava/util/Iterator;
    //   187: astore #6
    //   189: aload #6
    //   191: invokeinterface hasNext : ()Z
    //   196: ifeq -> 233
    //   199: aload #6
    //   201: invokeinterface next : ()Ljava/lang/Object;
    //   206: astore #7
    //   208: aload #7
    //   210: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentObservation
    //   213: astore #8
    //   215: iconst_0
    //   216: istore #9
    //   218: aload #8
    //   220: invokevirtual getElement : ()Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;
    //   223: instanceof com/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage
    //   226: ifne -> 189
    //   229: iconst_0
    //   230: goto -> 234
    //   233: iconst_1
    //   234: istore #4
    //   236: getstatic kotlin/_Assertions.ENABLED : Z
    //   239: ifeq -> 261
    //   242: iload #4
    //   244: ifne -> 261
    //   247: ldc 'Assertion failed'
    //   249: astore #5
    //   251: new java/lang/AssertionError
    //   254: dup
    //   255: aload #5
    //   257: invokespecial <init> : (Ljava/lang/Object;)V
    //   260: athrow
    //   261: aload_1
    //   262: invokestatic last : (Ljava/util/List;)Ljava/lang/Object;
    //   265: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentObservation
    //   268: astore #4
    //   270: aload_0
    //   271: aload_2
    //   272: aload #11
    //   274: aload #11
    //   276: aload_1
    //   277: putfield L$0 : Ljava/lang/Object;
    //   280: aload #11
    //   282: aload #4
    //   284: putfield L$1 : Ljava/lang/Object;
    //   287: aload #11
    //   289: iconst_1
    //   290: putfield label : I
    //   293: invokevirtual getStepsInformation : (Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   296: dup
    //   297: aload #18
    //   299: if_acmpne -> 331
    //   302: aload #18
    //   304: areturn
    //   305: aload #11
    //   307: getfield L$1 : Ljava/lang/Object;
    //   310: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentObservation
    //   313: astore #4
    //   315: aload #11
    //   317: getfield L$0 : Ljava/lang/Object;
    //   320: checkcast java/util/List
    //   323: astore_1
    //   324: aload #10
    //   326: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   329: aload #10
    //   331: aload #4
    //   333: invokevirtual getElement : ()Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;
    //   336: invokeinterface getContent : ()Ljava/lang/String;
    //   341: <illegal opcode> makeConcatWithConstants : (Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;
    //   346: aload #4
    //   348: invokevirtual getElement : ()Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;
    //   351: invokeinterface getKind : ()Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind;
    //   356: aconst_null
    //   357: aconst_null
    //   358: bipush #12
    //   360: aconst_null
    //   361: astore #12
    //   363: istore #13
    //   365: astore #14
    //   367: astore #15
    //   369: astore #16
    //   371: astore #17
    //   373: new com/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage
    //   376: dup
    //   377: aload #17
    //   379: aload #16
    //   381: aload #15
    //   383: aload #14
    //   385: iload #13
    //   387: aload #12
    //   389: invokespecial <init> : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind;Ljava/util/List;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    //   392: astore #5
    //   394: aload_1
    //   395: iconst_1
    //   396: invokestatic dropLast : (Ljava/util/List;I)Ljava/util/List;
    //   399: checkcast java/util/Collection
    //   402: new com/intellij/ml/llm/matterhorn/ej/core/AgentObservation
    //   405: dup
    //   406: aload #5
    //   408: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChatElement
    //   411: aconst_null
    //   412: iconst_2
    //   413: aconst_null
    //   414: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    //   417: invokestatic plus : (Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;
    //   420: areturn
    //   421: new java/lang/IllegalStateException
    //   424: dup
    //   425: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   427: invokespecial <init> : (Ljava/lang/String;)V
    //   430: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #50	-> 60
    //   #54	-> 93
    //   #55	-> 146
    //   #65	-> 155
    //   #66	-> 180
    //   #55	-> 218
    //   #66	-> 226
    //   #67	-> 233
    //   #55	-> 236
    //   #56	-> 261
    //   #57	-> 270
    //   #58	-> 270
    //   #50	-> 302
    //   #58	-> 331
    //   #59	-> 346
    //   #57	-> 356
    //   #61	-> 394
    //   #50	-> 421
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   93	53	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/AddStepsInfo$Companion;
    //   146	34	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/AddStepsInfo$Companion;
    //   180	46	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/AddStepsInfo$Companion;
    //   226	7	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/AddStepsInfo$Companion;
    //   233	1	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/AddStepsInfo$Companion;
    //   234	27	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/AddStepsInfo$Companion;
    //   261	35	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/AddStepsInfo$Companion;
    //   93	53	1	observations	Ljava/util/List;
    //   146	34	1	observations	Ljava/util/List;
    //   180	46	1	observations	Ljava/util/List;
    //   226	7	1	observations	Ljava/util/List;
    //   233	1	1	observations	Ljava/util/List;
    //   234	27	1	observations	Ljava/util/List;
    //   261	44	1	observations	Ljava/util/List;
    //   324	97	1	observations	Ljava/util/List;
    //   93	53	2	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
    //   146	34	2	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
    //   180	46	2	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
    //   226	7	2	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
    //   233	1	2	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
    //   234	27	2	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
    //   261	35	2	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
    //   152	28	4	$this$all$iv	Ljava/lang/Iterable;
    //   180	9	4	$this$all$iv	Ljava/lang/Iterable;
    //   270	35	4	lastObservation	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentObservation;
    //   315	106	4	lastObservation	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentObservation;
    //   394	27	5	updatedLastObservation	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage;
    //   208	25	7	element$iv	Ljava/lang/Object;
    //   215	11	8	it	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentObservation;
    //   218	8	9	$i$a$-all-AddStepsInfo$Companion$addStepsInfo$2	I
    //   155	79	5	$i$f$all	I
    //   0	431	3	$completion	Lkotlin/coroutines/Continuation;
    //   50	371	11	$continuation	Lkotlin/coroutines/Continuation;
    //   57	364	10	$result	Ljava/lang/Object;
  }
  
  @DebugMetadata(f = "AddStepsInfo.kt", l = {58}, i = {0, 0}, s = {"L$0", "L$1"}, n = {"observations", "lastObservation"}, m = "addStepsInfo", c = "com.intellij.ml.llm.matterhorn.ej.core.history_processors.AddStepsInfo$Companion")
  @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
  static final class AddStepsInfo$Companion$addStepsInfo$1 extends ContinuationImpl {
    Object L$0;
    
    Object L$1;
    
    int label;
    
    AddStepsInfo$Companion$addStepsInfo$1(Continuation $completion) {
      super($completion);
    }
    
    @Nullable
    public final Object invokeSuspend(@NotNull Object $result) {
      this.result = $result;
      this.label |= Integer.MIN_VALUE;
      return AddStepsInfo.Companion.this.addStepsInfo(null, null, (Continuation<? super List<AgentObservation>>)this);
    }
  }
  
  @DebugMetadata(f = "AddStepsInfo.kt", l = {43}, i = {0}, s = {"L$0"}, n = {"context"}, m = "getStepsInformation", c = "com.intellij.ml.llm.matterhorn.ej.core.history_processors.AddStepsInfo$Companion")
  @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
  static final class AddStepsInfo$Companion$getStepsInformation$1 extends ContinuationImpl {
    Object L$0;
    
    int label;
    
    AddStepsInfo$Companion$getStepsInformation$1(Continuation $completion) {
      super($completion);
    }
    
    @Nullable
    public final Object invokeSuspend(@NotNull Object $result) {
      this.result = $result;
      this.label |= Integer.MIN_VALUE;
      return AddStepsInfo.Companion.this.getStepsInformation(null, (Continuation<? super String>)this);
    }
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\history_processors\AddStepsInfo$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */