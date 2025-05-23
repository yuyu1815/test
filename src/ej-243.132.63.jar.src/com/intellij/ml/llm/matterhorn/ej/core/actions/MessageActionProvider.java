/*    */ package com.intellij.ml.llm.matterhorn.ej.core.actions;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.AgentAction;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.ExecutionAgentContext;
/*    */ import com.intellij.ml.llm.matterhorn.llm.MatterhornChat;
/*    */ import com.intellij.ml.llm.matterhorn.llm.MatterhornChatElement;
/*    */ import com.intellij.ml.llm.matterhorn.llm.MatterhornChatMessage;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000<\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\002\b\007\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\002\b\002\n\002\020\016\n\000\n\002\030\002\n\000\030\0002\0020\001B\035\022\006\020\002\032\0020\003\022\f\020\004\032\b\022\004\022\0020\0060\005¢\006\004\b\007\020\bJ\036\020\r\032\0020\0162\006\020\017\032\0020\0202\006\020\021\032\0020\022H@¢\006\002\020\023J\b\020\024\032\0020\025H\026J\b\020\026\032\0020\027H\026R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\t\020\nR\027\020\004\032\b\022\004\022\0020\0060\005¢\006\b\n\000\032\004\b\013\020\f¨\006\030"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/MessageActionProvider;", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionProvider;", "chat", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;", "availableActions", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentAction;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;Ljava/util/List;)V", "getChat", "()Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;", "getAvailableActions", "()Ljava/util/List;", "getAction", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;", "executionAgentContext", "Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;", "doReview", "", "(Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getActionString", "", "getObservation", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;", "ej-core"})
/*    */ public final class MessageActionProvider
/*    */   implements ActionProvider
/*    */ {
/*    */   @NotNull
/*    */   private final MatterhornChat chat;
/*    */   @NotNull
/*    */   private final List<AgentAction> availableActions;
/*    */   
/*    */   public MessageActionProvider(@NotNull MatterhornChat chat, @NotNull List<AgentAction> availableActions) {
/* 33 */     this.chat = chat; this.availableActions = availableActions; } @NotNull public final MatterhornChat getChat() { return this.chat; } @NotNull public final List<AgentAction> getAvailableActions() { return this.availableActions; }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public Object getAction(@NotNull ExecutionAgentContext executionAgentContext, boolean doReview, @NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload_3
/*    */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/core/actions/MessageActionProvider$getAction$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_3
/*    */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/MessageActionProvider$getAction$1
/*    */     //   11: astore #7
/*    */     //   13: aload #7
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #7
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 50
/*    */     //   39: new com/intellij/ml/llm/matterhorn/ej/core/actions/MessageActionProvider$getAction$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_3
/*    */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/actions/MessageActionProvider;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #7
/*    */     //   50: aload #7
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #6
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #8
/*    */     //   62: aload #7
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 192, 0 -> 88, 1 -> 171
/*    */     //   88: aload #6
/*    */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   93: aload_0
/*    */     //   94: getfield chat : Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;
/*    */     //   97: invokevirtual getMessages : ()Ljava/util/List;
/*    */     //   100: invokestatic last : (Ljava/util/List;)Ljava/lang/Object;
/*    */     //   103: dup
/*    */     //   104: ldc 'null cannot be cast to non-null type com.intellij.ml.llm.matterhorn.llm.MatterhornChatMessage'
/*    */     //   106: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   109: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage
/*    */     //   112: invokevirtual getContent : ()Ljava/lang/String;
/*    */     //   115: astore #4
/*    */     //   117: getstatic com/intellij/ml/llm/matterhorn/ej/core/actions/SimpleActionRequest.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/actions/SimpleActionRequest$Companion;
/*    */     //   120: aload #4
/*    */     //   122: invokevirtual parse : (Ljava/lang/String;)Lcom/intellij/ml/llm/matterhorn/ej/core/actions/SimpleActionRequest;
/*    */     //   125: astore #5
/*    */     //   127: iload_2
/*    */     //   128: ifeq -> 189
/*    */     //   131: getstatic com/intellij/ml/llm/matterhorn/ej/core/actions/ActionProvider.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionProvider$Companion;
/*    */     //   134: aload #5
/*    */     //   136: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest
/*    */     //   139: aload_1
/*    */     //   140: aload_0
/*    */     //   141: getfield availableActions : Ljava/util/List;
/*    */     //   144: aload #7
/*    */     //   146: aload #7
/*    */     //   148: aload #5
/*    */     //   150: putfield L$0 : Ljava/lang/Object;
/*    */     //   153: aload #7
/*    */     //   155: iconst_1
/*    */     //   156: putfield label : I
/*    */     //   159: invokevirtual reviewRequest : (Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   162: dup
/*    */     //   163: aload #8
/*    */     //   165: if_acmpne -> 188
/*    */     //   168: aload #8
/*    */     //   170: areturn
/*    */     //   171: aload #7
/*    */     //   173: getfield L$0 : Ljava/lang/Object;
/*    */     //   176: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/SimpleActionRequest
/*    */     //   179: astore #5
/*    */     //   181: aload #6
/*    */     //   183: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   186: aload #6
/*    */     //   188: pop
/*    */     //   189: aload #5
/*    */     //   191: areturn
/*    */     //   192: new java/lang/IllegalStateException
/*    */     //   195: dup
/*    */     //   196: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   198: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   201: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #34	-> 60
/*    */     //   #35	-> 93
/*    */     //   #36	-> 117
/*    */     //   #37	-> 127
/*    */     //   #38	-> 131
/*    */     //   #34	-> 168
/*    */     //   #40	-> 188
/*    */     //   #34	-> 192
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   93	69	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/MessageActionProvider;
/*    */     //   93	69	1	executionAgentContext	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*    */     //   93	38	2	doReview	Z
/*    */     //   117	10	4	actionString	Ljava/lang/String;
/*    */     //   127	44	5	actionRequest	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/SimpleActionRequest;
/*    */     //   181	11	5	actionRequest	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/SimpleActionRequest;
/*    */     //   0	202	3	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   50	142	7	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	135	6	$result	Ljava/lang/Object;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String getActionString() {
/* 43 */     Intrinsics.checkNotNull(CollectionsKt.last(this.chat.getMessages()), "null cannot be cast to non-null type com.intellij.ml.llm.matterhorn.llm.MatterhornChatMessage"); return ((MatterhornChatMessage)CollectionsKt.last(this.chat.getMessages())).getContent();
/*    */   } @NotNull
/*    */   public MatterhornChatElement getObservation() {
/* 46 */     Intrinsics.checkNotNull(CollectionsKt.last(this.chat.getMessages()), "null cannot be cast to non-null type com.intellij.ml.llm.matterhorn.llm.MatterhornChatMessage"); return (MatterhornChatElement)CollectionsKt.last(this.chat.getMessages());
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "ActionProvider.kt", l = {38}, i = {0}, s = {"L$0"}, n = {"actionRequest"}, m = "getAction", c = "com.intellij.ml.llm.matterhorn.ej.core.actions.MessageActionProvider")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   static final class MessageActionProvider$getAction$1 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     int label;
/*    */     
/*    */     MessageActionProvider$getAction$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return MessageActionProvider.this.getAction(null, false, (Continuation<? super ActionRequest>)this);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\actions\MessageActionProvider.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */