/*     */ package com.intellij.ml.llm.matterhorn.ej.core;
/*     */ 
/*     */ import com.intellij.openapi.diagnostic.Logger;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.serialization.KSerializer;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0006\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\002\n\002\020\b\n\002\b\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J \020\b\032\004\030\0010\t2\006\020\n\032\0020\0132\006\020\f\032\0020\rH@¢\006\002\020\016J\f\020\022\032\b\022\004\022\0020\t0\023R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\006\020\007R\016\020\017\032\0020\020XT¢\006\002\n\000R\016\020\021\032\0020\020XT¢\006\002\n\000¨\006\024"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/AgentIssue$Companion;", "", "<init>", "()V", "logger", "Lcom/intellij/openapi/diagnostic/Logger;", "getLogger", "()Lcom/intellij/openapi/diagnostic/Logger;", "parse", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentIssue;", "section", "", "project", "Lcom/intellij/openapi/project/Project;", "(Ljava/lang/String;Lcom/intellij/openapi/project/Project;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "SMALL_FILE_LIMIT_EXPLICIT", "", "TOTAL_FILE_LIMIT_EXPLICIT", "serializer", "Lkotlinx/serialization/KSerializer;", "ej-core"})
/*     */ @SourceDebugExtension({"SMAP\nAgentIssue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AgentIssue.kt\ncom/intellij/ml/llm/matterhorn/ej/core/AgentIssue$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,157:1\n774#2:158\n865#2,2:159\n*S KotlinDebug\n*F\n+ 1 AgentIssue.kt\ncom/intellij/ml/llm/matterhorn/ej/core/AgentIssue$Companion\n*L\n140#1:158\n140#1:159,2\n*E\n"})
/*     */ public final class Companion
/*     */ {
/*     */   private Companion() {}
/*     */   
/*     */   @NotNull
/*     */   public final KSerializer<AgentIssue> serializer() {
/* 137 */     return (KSerializer<AgentIssue>)AgentIssue.$serializer.INSTANCE; } @NotNull
/* 138 */   public final Logger getLogger() { return AgentIssue.access$getLogger$cp(); }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public final Object parse(@NotNull String section, @NotNull Project project, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_3
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/core/AgentIssue$Companion$parse$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_3
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentIssue$Companion$parse$1
/*     */     //   11: astore #18
/*     */     //   13: aload #18
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #18
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new com/intellij/ml/llm/matterhorn/ej/core/AgentIssue$Companion$parse$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_3
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/AgentIssue$Companion;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #18
/*     */     //   50: aload #18
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #17
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #29
/*     */     //   62: aload #18
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 465, 0 -> 88, 1 -> 370
/*     */     //   88: aload #17
/*     */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   93: aload_1
/*     */     //   94: checkcast java/lang/CharSequence
/*     */     //   97: invokestatic trim : (Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
/*     */     //   100: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   103: checkcast java/lang/CharSequence
/*     */     //   106: invokestatic lines : (Ljava/lang/CharSequence;)Ljava/util/List;
/*     */     //   109: checkcast java/lang/Iterable
/*     */     //   112: astore #5
/*     */     //   114: iconst_0
/*     */     //   115: istore #6
/*     */     //   117: aload #5
/*     */     //   119: astore #7
/*     */     //   121: new java/util/ArrayList
/*     */     //   124: dup
/*     */     //   125: invokespecial <init> : ()V
/*     */     //   128: checkcast java/util/Collection
/*     */     //   131: astore #8
/*     */     //   133: iconst_0
/*     */     //   134: istore #9
/*     */     //   136: aload #7
/*     */     //   138: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   143: astore #10
/*     */     //   145: aload #10
/*     */     //   147: invokeinterface hasNext : ()Z
/*     */     //   152: ifeq -> 207
/*     */     //   155: aload #10
/*     */     //   157: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   162: astore #11
/*     */     //   164: aload #11
/*     */     //   166: checkcast java/lang/String
/*     */     //   169: astore #12
/*     */     //   171: iconst_0
/*     */     //   172: istore #13
/*     */     //   174: aload #12
/*     */     //   176: checkcast java/lang/CharSequence
/*     */     //   179: invokestatic isBlank : (Ljava/lang/CharSequence;)Z
/*     */     //   182: ifne -> 189
/*     */     //   185: iconst_1
/*     */     //   186: goto -> 190
/*     */     //   189: iconst_0
/*     */     //   190: nop
/*     */     //   191: ifeq -> 145
/*     */     //   194: aload #8
/*     */     //   196: aload #11
/*     */     //   198: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   203: pop
/*     */     //   204: goto -> 145
/*     */     //   207: aload #8
/*     */     //   209: checkcast java/util/List
/*     */     //   212: nop
/*     */     //   213: astore #4
/*     */     //   215: aload #4
/*     */     //   217: invokeinterface isEmpty : ()Z
/*     */     //   222: ifne -> 247
/*     */     //   225: aload #4
/*     */     //   227: iconst_0
/*     */     //   228: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   233: checkcast java/lang/String
/*     */     //   236: ldc '###'
/*     */     //   238: iconst_0
/*     */     //   239: iconst_2
/*     */     //   240: aconst_null
/*     */     //   241: invokestatic startsWith$default : (Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z
/*     */     //   244: ifne -> 249
/*     */     //   247: aconst_null
/*     */     //   248: areturn
/*     */     //   249: aload #4
/*     */     //   251: iconst_0
/*     */     //   252: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   257: checkcast java/lang/String
/*     */     //   260: ldc '###'
/*     */     //   262: checkcast java/lang/CharSequence
/*     */     //   265: invokestatic removePrefix : (Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;
/*     */     //   268: checkcast java/lang/CharSequence
/*     */     //   271: invokestatic trim : (Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
/*     */     //   274: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   277: astore #5
/*     */     //   279: aload #4
/*     */     //   281: iconst_1
/*     */     //   282: aload #4
/*     */     //   284: invokeinterface size : ()I
/*     */     //   289: invokeinterface subList : (II)Ljava/util/List;
/*     */     //   294: checkcast java/lang/Iterable
/*     */     //   297: ldc '\\n'
/*     */     //   299: checkcast java/lang/CharSequence
/*     */     //   302: aconst_null
/*     */     //   303: aconst_null
/*     */     //   304: iconst_0
/*     */     //   305: aconst_null
/*     */     //   306: aconst_null
/*     */     //   307: bipush #62
/*     */     //   309: aconst_null
/*     */     //   310: invokestatic joinToString$default : (Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
/*     */     //   313: checkcast java/lang/CharSequence
/*     */     //   316: invokestatic trim : (Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
/*     */     //   319: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   322: astore #6
/*     */     //   324: aload #5
/*     */     //   326: aload #6
/*     */     //   328: astore #15
/*     */     //   330: astore #14
/*     */     //   332: getstatic com/intellij/ml/llm/matterhorn/ej/core/EditorContext.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/EditorContext$Companion;
/*     */     //   335: aload_2
/*     */     //   336: aload #18
/*     */     //   338: aload #18
/*     */     //   340: aload #14
/*     */     //   342: putfield L$0 : Ljava/lang/Object;
/*     */     //   345: aload #18
/*     */     //   347: aload #15
/*     */     //   349: putfield L$1 : Ljava/lang/Object;
/*     */     //   352: aload #18
/*     */     //   354: iconst_1
/*     */     //   355: putfield label : I
/*     */     //   358: invokevirtual collectEditorContext : (Lcom/intellij/openapi/project/Project;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   361: dup
/*     */     //   362: aload #29
/*     */     //   364: if_acmpne -> 397
/*     */     //   367: aload #29
/*     */     //   369: areturn
/*     */     //   370: aload #18
/*     */     //   372: getfield L$1 : Ljava/lang/Object;
/*     */     //   375: checkcast java/lang/String
/*     */     //   378: astore #15
/*     */     //   380: aload #18
/*     */     //   382: getfield L$0 : Ljava/lang/Object;
/*     */     //   385: checkcast java/lang/String
/*     */     //   388: astore #14
/*     */     //   390: aload #17
/*     */     //   392: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   395: aload #17
/*     */     //   397: astore #16
/*     */     //   399: aload #14
/*     */     //   401: aload #15
/*     */     //   403: aload #16
/*     */     //   405: checkcast com/intellij/ml/llm/matterhorn/ej/core/EditorContext
/*     */     //   408: aconst_null
/*     */     //   409: aconst_null
/*     */     //   410: aconst_null
/*     */     //   411: aconst_null
/*     */     //   412: aconst_null
/*     */     //   413: sipush #232
/*     */     //   416: aconst_null
/*     */     //   417: astore #19
/*     */     //   419: istore #20
/*     */     //   421: astore #21
/*     */     //   423: astore #22
/*     */     //   425: astore #23
/*     */     //   427: astore #24
/*     */     //   429: astore #25
/*     */     //   431: astore #26
/*     */     //   433: astore #27
/*     */     //   435: astore #28
/*     */     //   437: new com/intellij/ml/llm/matterhorn/ej/core/AgentIssue
/*     */     //   440: dup
/*     */     //   441: aload #28
/*     */     //   443: aload #27
/*     */     //   445: aload #26
/*     */     //   447: aload #25
/*     */     //   449: aload #24
/*     */     //   451: aload #23
/*     */     //   453: aload #22
/*     */     //   455: aload #21
/*     */     //   457: iload #20
/*     */     //   459: aload #19
/*     */     //   461: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/EditorContext;Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/PreviousTasksInfo;Ljava/util/List;Ljava/util/List;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   464: areturn
/*     */     //   465: new java/lang/IllegalStateException
/*     */     //   468: dup
/*     */     //   469: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   471: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   474: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #139	-> 60
/*     */     //   #140	-> 93
/*     */     //   #140	-> 106
/*     */     //   #158	-> 117
/*     */     //   #159	-> 136
/*     */     //   #140	-> 174
/*     */     //   #140	-> 190
/*     */     //   #159	-> 191
/*     */     //   #160	-> 207
/*     */     //   #158	-> 212
/*     */     //   #140	-> 213
/*     */     //   #141	-> 215
/*     */     //   #142	-> 247
/*     */     //   #145	-> 249
/*     */     //   #145	-> 277
/*     */     //   #146	-> 279
/*     */     //   #146	-> 322
/*     */     //   #147	-> 324
/*     */     //   #148	-> 324
/*     */     //   #149	-> 326
/*     */     //   #150	-> 332
/*     */     //   #139	-> 367
/*     */     //   #147	-> 408
/*     */     //   #151	-> 409
/*     */     //   #147	-> 410
/*     */     //   #139	-> 465
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   93	10	1	section	Ljava/lang/String;
/*     */     //   93	10	2	project	Lcom/intellij/openapi/project/Project;
/*     */     //   103	88	2	project	Lcom/intellij/openapi/project/Project;
/*     */     //   191	22	2	project	Lcom/intellij/openapi/project/Project;
/*     */     //   213	34	2	project	Lcom/intellij/openapi/project/Project;
/*     */     //   249	28	2	project	Lcom/intellij/openapi/project/Project;
/*     */     //   277	45	2	project	Lcom/intellij/openapi/project/Project;
/*     */     //   322	39	2	project	Lcom/intellij/openapi/project/Project;
/*     */     //   215	32	4	lines	Ljava/util/List;
/*     */     //   249	28	4	lines	Ljava/util/List;
/*     */     //   277	45	4	lines	Ljava/util/List;
/*     */     //   114	19	5	$this$filter$iv	Ljava/lang/Iterable;
/*     */     //   279	43	5	name	Ljava/lang/String;
/*     */     //   322	4	5	name	Ljava/lang/String;
/*     */     //   324	8	6	description	Ljava/lang/String;
/*     */     //   133	12	7	$this$filterTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   133	76	8	destination$iv$iv	Ljava/util/Collection;
/*     */     //   164	40	11	element$iv$iv	Ljava/lang/Object;
/*     */     //   171	18	12	it	Ljava/lang/String;
/*     */     //   174	17	13	$i$a$-filter-AgentIssue$Companion$parse$lines$1	I
/*     */     //   136	73	9	$i$f$filterTo	I
/*     */     //   117	96	6	$i$f$filter	I
/*     */     //   0	475	3	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	415	18	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	408	17	$result	Ljava/lang/Object;
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "AgentIssue.kt", l = {150}, i = {}, s = {}, n = {}, m = "parse", c = "com.intellij.ml.llm.matterhorn.ej.core.AgentIssue$Companion")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class AgentIssue$Companion$parse$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     int label;
/*     */     
/*     */     AgentIssue$Companion$parse$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return AgentIssue.Companion.this.parse(null, null, (Continuation<? super AgentIssue>)this);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\AgentIssue$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */