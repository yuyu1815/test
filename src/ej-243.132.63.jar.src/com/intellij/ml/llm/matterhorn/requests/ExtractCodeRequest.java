/*     */ package com.intellij.ml.llm.matterhorn.requests;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ExecutionContext;
/*     */ import com.intellij.ml.llm.matterhorn.InvalidContentFormatException;
/*     */ import com.intellij.ml.llm.matterhorn.llm.MatterhornChat;
/*     */ import com.intellij.ml.llm.matterhorn.llm.ModelParameters;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import java.util.regex.Matcher;
/*     */ import java.util.regex.Pattern;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendFunction;
/*     */ import kotlin.jvm.functions.Function3;
/*     */ import kotlin.jvm.internal.AdaptedFunctionReference;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.text.StringsKt;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\003\030\000 \r2\0020\001:\001\rB\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007J\026\020\b\032\0020\t2\006\020\n\032\0020\013H@¢\006\002\020\f¨\006\016"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/requests/ExtractCodeRequest;", "Lcom/intellij/ml/llm/matterhorn/requests/UserReviewedRequest;", "base", "Lcom/intellij/ml/llm/matterhorn/requests/GrazieRequest;", "modelParameters", "Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/requests/GrazieRequest;Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;)V", "execute", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;", "context", "Lcom/intellij/ml/llm/matterhorn/ExecutionContext;", "(Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "core"})
/*     */ public final class ExtractCodeRequest
/*     */   extends UserReviewedRequest
/*     */ {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   
/*     */   public ExtractCodeRequest(@NotNull GrazieRequest base, @NotNull ModelParameters modelParameters) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'base'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_2
/*     */     //   7: ldc 'modelParameters'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: aload_0
/*     */     //   13: aload_1
/*     */     //   14: aload_2
/*     */     //   15: new com/intellij/ml/llm/matterhorn/requests/ExtractCodeRequest$1
/*     */     //   18: dup
/*     */     //   19: getstatic com/intellij/ml/llm/matterhorn/requests/ExtractCodeRequest.Companion : Lcom/intellij/ml/llm/matterhorn/requests/ExtractCodeRequest$Companion;
/*     */     //   22: invokespecial <init> : (Ljava/lang/Object;)V
/*     */     //   25: checkcast kotlin/jvm/functions/Function3
/*     */     //   28: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/requests/GrazieRequest;Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;Lkotlin/jvm/functions/Function3;)V
/*     */     //   31: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #99	-> 12
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	32	0	this	Lcom/intellij/ml/llm/matterhorn/requests/ExtractCodeRequest;
/*     */     //   0	32	1	base	Lcom/intellij/ml/llm/matterhorn/requests/GrazieRequest;
/*     */     //   0	32	2	modelParameters	Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Object execute(@NotNull ExecutionContext context, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/requests/ExtractCodeRequest$execute$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_2
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/requests/ExtractCodeRequest$execute$1
/*     */     //   11: astore #7
/*     */     //   13: aload #7
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #7
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new com/intellij/ml/llm/matterhorn/requests/ExtractCodeRequest$execute$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_2
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/requests/ExtractCodeRequest;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #7
/*     */     //   50: aload #7
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #6
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #8
/*     */     //   62: aload #7
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 197, 0 -> 88, 1 -> 115
/*     */     //   88: aload #6
/*     */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   93: aload_0
/*     */     //   94: aload_1
/*     */     //   95: aload #7
/*     */     //   97: aload #7
/*     */     //   99: iconst_1
/*     */     //   100: putfield label : I
/*     */     //   103: invokespecial execute : (Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   106: dup
/*     */     //   107: aload #8
/*     */     //   109: if_acmpne -> 122
/*     */     //   112: aload #8
/*     */     //   114: areturn
/*     */     //   115: aload #6
/*     */     //   117: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   120: aload #6
/*     */     //   122: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChat
/*     */     //   125: astore_3
/*     */     //   126: aload_3
/*     */     //   127: invokevirtual getMessages : ()Ljava/util/List;
/*     */     //   130: invokestatic last : (Ljava/util/List;)Ljava/lang/Object;
/*     */     //   133: dup
/*     */     //   134: ldc 'null cannot be cast to non-null type com.intellij.ml.llm.matterhorn.llm.MatterhornChatMessage'
/*     */     //   136: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   139: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage
/*     */     //   142: astore #4
/*     */     //   144: getstatic com/intellij/ml/llm/matterhorn/requests/ExtractCodeRequest.Companion : Lcom/intellij/ml/llm/matterhorn/requests/ExtractCodeRequest$Companion;
/*     */     //   147: aload #4
/*     */     //   149: invokevirtual getContent : ()Ljava/lang/String;
/*     */     //   152: invokevirtual extractCodeFragments : (Ljava/lang/String;)Ljava/util/List;
/*     */     //   155: invokestatic firstOrNull : (Ljava/util/List;)Ljava/lang/Object;
/*     */     //   158: checkcast java/lang/String
/*     */     //   161: dup
/*     */     //   162: ifnonnull -> 168
/*     */     //   165: pop
/*     */     //   166: ldc ''
/*     */     //   168: astore #5
/*     */     //   170: aload_3
/*     */     //   171: new com/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage
/*     */     //   174: dup
/*     */     //   175: aload #5
/*     */     //   177: aload #4
/*     */     //   179: invokevirtual getKind : ()Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind;
/*     */     //   182: aconst_null
/*     */     //   183: aconst_null
/*     */     //   184: bipush #12
/*     */     //   186: aconst_null
/*     */     //   187: invokespecial <init> : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind;Ljava/util/List;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   190: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChatElement
/*     */     //   193: invokevirtual withNewMessage : (Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;)Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;
/*     */     //   196: areturn
/*     */     //   197: new java/lang/IllegalStateException
/*     */     //   200: dup
/*     */     //   201: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   203: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   206: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #100	-> 60
/*     */     //   #101	-> 94
/*     */     //   #100	-> 112
/*     */     //   #102	-> 126
/*     */     //   #103	-> 144
/*     */     //   #105	-> 170
/*     */     //   #100	-> 197
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   93	1	0	this	Lcom/intellij/ml/llm/matterhorn/requests/ExtractCodeRequest;
/*     */     //   93	13	1	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   126	71	3	originalChat	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;
/*     */     //   144	53	4	lastMessage	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage;
/*     */     //   170	27	5	codeFragment	Ljava/lang/String;
/*     */     //   0	207	2	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	147	7	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	140	6	$result	Ljava/lang/Object;
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020!\n\002\020\016\n\002\b\002\n\002\030\002\n\000\n\002\020\b\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\024\020\004\032\b\022\004\022\0020\0060\0052\006\020\007\032\0020\006J\030\020\b\032\0020\t2\006\020\007\032\0020\0062\006\020\n\032\0020\013H\002¨\006\f"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/requests/ExtractCodeRequest$Companion;", "", "<init>", "()V", "extractCodeFragments", "", "", "text", "review", "Lcom/intellij/ml/llm/matterhorn/requests/ReviewerResponse;", "attempt", "", "core"})
/*     */   public static final class Companion
/*     */   {
/*     */     private Companion() {}
/*     */     
/*     */     @NotNull
/*     */     public final List<String> extractCodeFragments(@NotNull String text) {
/* 110 */       Intrinsics.checkNotNullParameter(text, "text"); String patternString = "```(`)*(?:[\\w ]+)?(.*)```(`)*";
/* 111 */       Pattern pattern = Pattern.compile(patternString, 32);
/* 112 */       Matcher matcher = pattern.matcher(text);
/*     */       
/* 114 */       List<String> fragments = new ArrayList();
/* 115 */       while (matcher.find()) {
/* 116 */         Intrinsics.checkNotNullExpressionValue(matcher.group(2), "group(...)"); fragments.add(StringsKt.trim(matcher.group(2)).toString());
/*     */       } 
/* 118 */       return fragments;
/*     */     }
/*     */     
/*     */     private final ReviewerResponse review(String text, int attempt) {
/* 122 */       List<String> fragments = extractCodeFragments(text);
/*     */       
/* 124 */       if (attempt > 3) {
/* 125 */         throw new InvalidContentFormatException("Can not extract code fragment from answer");
/*     */       }
/* 127 */       return fragments.isEmpty() ? 
/* 128 */         new ReviewerResponse.Error("The answer contains no code fragment in ``` and ```. Make sure it contains only one code fragment!", null, 2, null) : (
/* 129 */         (fragments.size() > 1) ? 
/* 130 */         new ReviewerResponse.Error("The answer contains " + fragments.size() + " code fragments in ``` and ```. Make sure it contains only one code fragment!", null, 2, null) : 
/* 131 */         ReviewerResponse.OK.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "UserReviewedRequest.kt", l = {101}, i = {}, s = {}, n = {}, m = "execute", c = "com.intellij.ml.llm.matterhorn.requests.ExtractCodeRequest")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class ExtractCodeRequest$execute$1 extends ContinuationImpl {
/*     */     int label;
/*     */     
/*     */     ExtractCodeRequest$execute$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return ExtractCodeRequest.this.execute(null, (Continuation<? super MatterhornChat>)this);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\requests\ExtractCodeRequest.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */