/*    */ package com.intellij.ml.llm.matterhorn.ej.core.services.search;
/*    */ 
/*    */ import com.intellij.find.FindModel;
/*    */ import com.intellij.usageView.UsageInfo;
/*    */ import java.util.Set;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlinx.coroutines.BuildersKt;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ import kotlinx.coroutines.Job;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @DebugMetadata(f = "TextProjectSearcher.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.core.services.search.TextProjectSearcher$searchProject$2")
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\030\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */ final class TextProjectSearcher$searchProject$2
/*    */   extends SuspendLambda
/*    */   implements Function2<CoroutineScope, Continuation<? super Job>, Object>
/*    */ {
/*    */   int label;
/*    */   
/*    */   TextProjectSearcher$searchProject$2(TextProjectSearcher $receiver, SearchQuery $query, Set<UsageInfo> $result, Continuation $completion) {
/*    */     super(2, $completion);
/*    */   }
/*    */   
/*    */   public final Object invokeSuspend(Object $result) {
/*    */     CoroutineScope $this$withOptionalTimeout;
/* 60 */     IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); $this$withOptionalTimeout = (CoroutineScope)this.L$0;
/* 61 */         return BuildersKt.launch$default($this$withOptionalTimeout, null, null, new Function2<CoroutineScope, Continuation<? super Unit>, Object>(TextProjectSearcher.this, this.$query, this.$result, null) {
/*    */               int label;
/*    */               
/*    */               private static final boolean invokeSuspend$lambda$4$lambda$3(Function1 $tmp0, Object p0) {
/* 65 */                 return ((Boolean)$tmp0.invoke(p0)).booleanValue();
/*    */               }
/*    */               
/*    */               public final Object invokeSuspend(Object $result) {
/*    */                 // Byte code:
/*    */                 //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */                 //   3: astore_2
/*    */                 //   4: aload_0
/*    */                 //   5: getfield label : I
/*    */                 //   8: tableswitch default -> 86, 0 -> 32, 1 -> 76
/*    */                 //   32: aload_1
/*    */                 //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */                 //   36: aload_0
/*    */                 //   37: getfield $findModel : Lcom/intellij/find/FindModel;
/*    */                 //   40: aload_0
/*    */                 //   41: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/TextProjectSearcher;
/*    */                 //   44: aload_0
/*    */                 //   45: getfield $query : Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchQuery;
/*    */                 //   48: aload_0
/*    */                 //   49: getfield $result : Ljava/util/Set;
/*    */                 //   52: <illegal opcode> invoke : (Lcom/intellij/find/FindModel;Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/TextProjectSearcher;Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchQuery;Ljava/util/Set;)Lkotlin/jvm/functions/Function0;
/*    */                 //   57: aload_0
/*    */                 //   58: checkcast kotlin/coroutines/Continuation
/*    */                 //   61: aload_0
/*    */                 //   62: iconst_1
/*    */                 //   63: putfield label : I
/*    */                 //   66: invokestatic coroutineToIndicator : (Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */                 //   69: dup
/*    */                 //   70: aload_2
/*    */                 //   71: if_acmpne -> 81
/*    */                 //   74: aload_2
/*    */                 //   75: areturn
/*    */                 //   76: aload_1
/*    */                 //   77: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */                 //   80: aload_1
/*    */                 //   81: pop
/*    */                 //   82: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*    */                 //   85: areturn
/*    */                 //   86: new java/lang/IllegalStateException
/*    */                 //   89: dup
/*    */                 //   90: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */                 //   92: invokespecial <init> : (Ljava/lang/String;)V
/*    */                 //   95: athrow
/*    */                 // Line number table:
/*    */                 //   Java source line number -> byte code offset
/*    */                 //   #61	-> 3
/*    */                 //   #62	-> 36
/*    */                 //   #61	-> 74
/*    */                 //   #78	-> 81
/*    */                 //   #61	-> 86
/*    */                 // Local variable table:
/*    */                 //   start	length	slot	name	descriptor
/*    */                 //   0	96	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/TextProjectSearcher$searchProject$2$1;
/*    */                 //   36	50	1	$result	Ljava/lang/Object;
/*    */               }
/*    */               
/*    */               private static final Unit invokeSuspend$lambda$4(FindModel $findModel, TextProjectSearcher this$0, SearchQuery $query, Set $result) {
/*    */                 // Byte code:
/*    */                 //   0: invokestatic getGlobalProgressIndicator : ()Lcom/intellij/openapi/progress/ProgressIndicator;
/*    */                 //   3: astore #4
/*    */                 //   5: new com/intellij/usages/UsageViewPresentation
/*    */                 //   8: dup
/*    */                 //   9: invokespecial <init> : ()V
/*    */                 //   12: astore #6
/*    */                 //   14: aload #6
/*    */                 //   16: astore #7
/*    */                 //   18: iconst_0
/*    */                 //   19: istore #8
/*    */                 //   21: aload #7
/*    */                 //   23: iconst_1
/*    */                 //   24: invokevirtual setDetachedMode : (Z)V
/*    */                 //   27: aload #6
/*    */                 //   29: astore #9
/*    */                 //   31: new com/intellij/usages/FindUsagesProcessPresentation
/*    */                 //   34: dup
/*    */                 //   35: aload #9
/*    */                 //   37: invokespecial <init> : (Lcom/intellij/usages/UsageViewPresentation;)V
/*    */                 //   40: astore #5
/*    */                 //   42: aload_0
/*    */                 //   43: aload_1
/*    */                 //   44: invokevirtual getProject : ()Lcom/intellij/openapi/project/Project;
/*    */                 //   47: aload #4
/*    */                 //   49: aload #5
/*    */                 //   51: invokestatic emptySet : ()Ljava/util/Set;
/*    */                 //   54: aload_1
/*    */                 //   55: aload_2
/*    */                 //   56: aload_3
/*    */                 //   57: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/TextProjectSearcher;Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchQuery;Ljava/util/Set;)Lkotlin/jvm/functions/Function1;
/*    */                 //   62: <illegal opcode> process : (Lkotlin/jvm/functions/Function1;)Lcom/intellij/util/Processor;
/*    */                 //   67: invokestatic findUsages : (Lcom/intellij/find/FindModel;Lcom/intellij/openapi/project/Project;Lcom/intellij/openapi/progress/ProgressIndicator;Lcom/intellij/usages/FindUsagesProcessPresentation;Ljava/util/Set;Lcom/intellij/util/Processor;)V
/*    */                 //   70: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*    */                 //   73: areturn
/*    */                 // Line number table:
/*    */                 //   Java source line number -> byte code offset
/*    */                 //   #63	-> 0
/*    */                 //   #64	-> 5
/*    */                 //   #108	-> 18
/*    */                 //   #64	-> 21
/*    */                 //   #64	-> 27
/*    */                 //   #64	-> 29
/*    */                 //   #65	-> 42
/*    */                 //   #77	-> 70
/*    */                 // Local variable table:
/*    */                 //   start	length	slot	name	descriptor
/*    */                 //   21	6	8	$i$a$-apply-TextProjectSearcher$searchProject$2$1$1$presentation$1	I
/*    */                 //   18	9	7	$this$invokeSuspend_u24lambda_u244_u24lambda_u240	Lcom/intellij/usages/UsageViewPresentation;
/*    */                 //   5	69	4	progressIndicator	Lcom/intellij/openapi/progress/ProgressIndicator;
/*    */                 //   42	32	5	presentation	Lcom/intellij/usages/FindUsagesProcessPresentation;
/*    */                 //   0	74	0	$findModel	Lcom/intellij/find/FindModel;
/*    */                 //   0	74	1	this$0	Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/TextProjectSearcher;
/*    */                 //   0	74	2	$query	Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchQuery;
/*    */                 //   0	74	3	$result	Ljava/util/Set;
/*    */               }
/*    */               
/*    */               private static final boolean invokeSuspend$lambda$4$lambda$2(TextProjectSearcher this$0, SearchQuery $query, Set $result, UsageInfo info) {
/*    */                 // Byte code:
/*    */                 //   0: aload_3
/*    */                 //   1: invokevirtual getFile : ()Lcom/intellij/psi/PsiFile;
/*    */                 //   4: astore #4
/*    */                 //   6: aload #4
/*    */                 //   8: dup
/*    */                 //   9: ifnull -> 28
/*    */                 //   12: invokeinterface getVirtualFile : ()Lcom/intellij/openapi/vfs/VirtualFile;
/*    */                 //   17: dup
/*    */                 //   18: ifnull -> 28
/*    */                 //   21: invokestatic toNioPathOrNull : (Lcom/intellij/openapi/vfs/VirtualFile;)Ljava/nio/file/Path;
/*    */                 //   24: dup
/*    */                 //   25: ifnonnull -> 31
/*    */                 //   28: pop
/*    */                 //   29: iconst_1
/*    */                 //   30: ireturn
/*    */                 //   31: astore #5
/*    */                 //   33: aload #5
/*    */                 //   35: invokevirtual toString : ()Ljava/lang/String;
/*    */                 //   38: checkcast java/lang/CharSequence
/*    */                 //   41: iconst_1
/*    */                 //   42: anewarray java/lang/String
/*    */                 //   45: astore #6
/*    */                 //   47: aload #6
/*    */                 //   49: iconst_0
/*    */                 //   50: ldc '/'
/*    */                 //   52: aastore
/*    */                 //   53: aload #6
/*    */                 //   55: iconst_0
/*    */                 //   56: iconst_0
/*    */                 //   57: bipush #6
/*    */                 //   59: aconst_null
/*    */                 //   60: invokestatic split$default : (Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;
/*    */                 //   63: checkcast java/lang/Iterable
/*    */                 //   66: astore #6
/*    */                 //   68: iconst_0
/*    */                 //   69: istore #7
/*    */                 //   71: aload #6
/*    */                 //   73: instanceof java/util/Collection
/*    */                 //   76: ifeq -> 96
/*    */                 //   79: aload #6
/*    */                 //   81: checkcast java/util/Collection
/*    */                 //   84: invokeinterface isEmpty : ()Z
/*    */                 //   89: ifeq -> 96
/*    */                 //   92: iconst_0
/*    */                 //   93: goto -> 152
/*    */                 //   96: aload #6
/*    */                 //   98: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */                 //   103: astore #8
/*    */                 //   105: aload #8
/*    */                 //   107: invokeinterface hasNext : ()Z
/*    */                 //   112: ifeq -> 151
/*    */                 //   115: aload #8
/*    */                 //   117: invokeinterface next : ()Ljava/lang/Object;
/*    */                 //   122: astore #9
/*    */                 //   124: aload #9
/*    */                 //   126: checkcast java/lang/String
/*    */                 //   129: astore #10
/*    */                 //   131: iconst_0
/*    */                 //   132: istore #11
/*    */                 //   134: aload #10
/*    */                 //   136: ldc '.'
/*    */                 //   138: iconst_0
/*    */                 //   139: iconst_2
/*    */                 //   140: aconst_null
/*    */                 //   141: invokestatic startsWith$default : (Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z
/*    */                 //   144: ifeq -> 105
/*    */                 //   147: iconst_1
/*    */                 //   148: goto -> 152
/*    */                 //   151: iconst_0
/*    */                 //   152: ifeq -> 157
/*    */                 //   155: iconst_1
/*    */                 //   156: ireturn
/*    */                 //   157: aload_0
/*    */                 //   158: aload_1
/*    */                 //   159: invokevirtual getFilter : ()Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchResultsFilter;
/*    */                 //   162: aload #4
/*    */                 //   164: invokevirtual checkFile : (Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchResultsFilter;Lcom/intellij/psi/PsiFile;)Z
/*    */                 //   167: ifne -> 172
/*    */                 //   170: iconst_1
/*    */                 //   171: ireturn
/*    */                 //   172: aload_2
/*    */                 //   173: aload_3
/*    */                 //   174: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*    */                 //   177: aload_3
/*    */                 //   178: invokeinterface add : (Ljava/lang/Object;)Z
/*    */                 //   183: pop
/*    */                 //   184: aload_2
/*    */                 //   185: invokeinterface size : ()I
/*    */                 //   190: aload_1
/*    */                 //   191: invokevirtual getQueryLimit : ()I
/*    */                 //   194: if_icmpge -> 201
/*    */                 //   197: iconst_1
/*    */                 //   198: goto -> 202
/*    */                 //   201: iconst_0
/*    */                 //   202: ireturn
/*    */                 // Line number table:
/*    */                 //   Java source line number -> byte code offset
/*    */                 //   #66	-> 0
/*    */                 //   #67	-> 6
/*    */                 //   #68	-> 33
/*    */                 //   #68	-> 38
/*    */                 //   #105	-> 71
/*    */                 //   #106	-> 96
/*    */                 //   #68	-> 134
/*    */                 //   #106	-> 144
/*    */                 //   #107	-> 151
/*    */                 //   #68	-> 152
/*    */                 //   #69	-> 155
/*    */                 //   #71	-> 157
/*    */                 //   #72	-> 170
/*    */                 //   #74	-> 172
/*    */                 //   #75	-> 184
/*    */                 // Local variable table:
/*    */                 //   start	length	slot	name	descriptor
/*    */                 //   134	10	11	$i$a$-any-TextProjectSearcher$searchProject$2$1$1$1$1	I
/*    */                 //   131	13	10	it	Ljava/lang/String;
/*    */                 //   124	27	9	element$iv	Ljava/lang/Object;
/*    */                 //   71	81	7	$i$f$any	I
/*    */                 //   68	84	6	$this$any$iv	Ljava/lang/Iterable;
/*    */                 //   6	197	4	file	Lcom/intellij/psi/PsiFile;
/*    */                 //   33	170	5	path	Ljava/nio/file/Path;
/*    */                 //   0	203	0	this$0	Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/TextProjectSearcher;
/*    */                 //   0	203	1	$query	Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchQuery;
/*    */                 //   0	203	2	$result	Ljava/util/Set;
/*    */                 //   0	203	3	info	Lcom/intellij/usageView/UsageInfo;
/*    */               }
/*    */               
/*    */               public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) {
/*    */                 return (Continuation)new Function2<>(this.$findModel, TextProjectSearcher.this, this.$query, this.$result, $completion);
/*    */               }
/*    */               
/*    */               public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*    */                 return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */               }
/*    */             }3, null); }
/*    */     
/*    */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   public final Continuation<Unit> create(Object value, Continuation<? super TextProjectSearcher$searchProject$2> $completion) {
/*    */     TextProjectSearcher$searchProject$2 textProjectSearcher$searchProject$2 = new TextProjectSearcher$searchProject$2(TextProjectSearcher.this, this.$query, this.$result, $completion);
/*    */     textProjectSearcher$searchProject$2.L$0 = value;
/*    */     return (Continuation<Unit>)textProjectSearcher$searchProject$2;
/*    */   }
/*    */   
/*    */   public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*    */     return ((TextProjectSearcher$searchProject$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\services\search\TextProjectSearcher$searchProject$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */