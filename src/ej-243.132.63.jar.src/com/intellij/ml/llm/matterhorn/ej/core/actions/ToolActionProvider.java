/*    */ package com.intellij.ml.llm.matterhorn.ej.core.actions;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.InvalidContentFormatException;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.AgentAction;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.ExecutionAgentContext;
/*    */ import com.intellij.ml.llm.matterhorn.llm.MatterhornAssistantChatMessageWithToolUses;
/*    */ import com.intellij.ml.llm.matterhorn.llm.MatterhornChat;
/*    */ import com.intellij.ml.llm.matterhorn.llm.MatterhornChatElement;
/*    */ import com.intellij.ml.llm.matterhorn.llm.MatterhornToolUse;
/*    */ import com.intellij.ml.llm.matterhorn.llm.ParameterValue;
/*    */ import java.util.LinkedHashMap;
/*    */ import java.util.List;
/*    */ import java.util.Map;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.collections.MapsKt;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlin.ranges.RangesKt;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\002\b\007\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\002\b\002\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\030\0002\0020\001B\035\022\006\020\002\032\0020\003\022\f\020\004\032\b\022\004\022\0020\0060\005¢\006\004\b\007\020\bJ\036\020\r\032\0020\0162\006\020\017\032\0020\0202\006\020\021\032\0020\022H@¢\006\002\020\023J\b\020\024\032\0020\025H\026J\b\020\026\032\0020\027H\026J\b\020\030\032\0020\031H\002R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\t\020\nR\027\020\004\032\b\022\004\022\0020\0060\005¢\006\b\n\000\032\004\b\013\020\f¨\006\032"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ToolActionProvider;", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionProvider;", "chat", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;", "availableActions", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentAction;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;Ljava/util/List;)V", "getChat", "()Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;", "getAvailableActions", "()Ljava/util/List;", "getAction", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;", "executionAgentContext", "Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;", "doReview", "", "(Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getActionString", "", "getObservation", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;", "getToolUse", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornAssistantChatMessageWithToolUses;", "ej-core"})
/*    */ @SourceDebugExtension({"SMAP\nActionProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActionProvider.kt\ncom/intellij/ml/llm/matterhorn/ej/core/actions/ToolActionProvider\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,93:1\n1216#2,2:94\n1246#2,4:96\n*S KotlinDebug\n*F\n+ 1 ActionProvider.kt\ncom/intellij/ml/llm/matterhorn/ej/core/actions/ToolActionProvider\n*L\n86#1:94,2\n86#1:96,4\n*E\n"})
/*    */ public final class ToolActionProvider
/*    */   implements ActionProvider
/*    */ {
/*    */   @NotNull
/*    */   private final MatterhornChat chat;
/*    */   @NotNull
/*    */   private final List<AgentAction> availableActions;
/*    */   
/*    */   public ToolActionProvider(@NotNull MatterhornChat chat, @NotNull List<AgentAction> availableActions) {
/* 50 */     this.chat = chat; this.availableActions = availableActions; } @NotNull public final MatterhornChat getChat() { return this.chat; } @NotNull public final List<AgentAction> getAvailableActions() { return this.availableActions; }
/*    */ 
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public Object getAction(@NotNull ExecutionAgentContext executionAgentContext, boolean doReview, @NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload_3
/*    */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/core/actions/ToolActionProvider$getAction$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_3
/*    */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/ToolActionProvider$getAction$1
/*    */     //   11: astore #12
/*    */     //   13: aload #12
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #12
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 50
/*    */     //   39: new com/intellij/ml/llm/matterhorn/ej/core/actions/ToolActionProvider$getAction$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_3
/*    */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ToolActionProvider;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #12
/*    */     //   50: aload #12
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #11
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #13
/*    */     //   62: aload #12
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 222, 0 -> 88, 1 -> 201
/*    */     //   88: aload #11
/*    */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   93: aload_0
/*    */     //   94: invokespecial getToolUse : ()Lcom/intellij/ml/llm/matterhorn/llm/MatterhornAssistantChatMessageWithToolUses;
/*    */     //   97: astore #4
/*    */     //   99: aload #4
/*    */     //   101: invokevirtual getToolUses : ()Ljava/util/List;
/*    */     //   104: invokestatic single : (Ljava/util/List;)Ljava/lang/Object;
/*    */     //   107: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornToolUse
/*    */     //   110: astore #5
/*    */     //   112: aload #5
/*    */     //   114: invokevirtual getName : ()Ljava/lang/String;
/*    */     //   117: astore #7
/*    */     //   119: aload #4
/*    */     //   121: invokevirtual getContent : ()Ljava/lang/String;
/*    */     //   124: astore #8
/*    */     //   126: aload #5
/*    */     //   128: invokevirtual getId : ()Ljava/lang/String;
/*    */     //   131: astore #9
/*    */     //   133: aload #5
/*    */     //   135: invokevirtual getInput : ()Ljava/util/Map;
/*    */     //   138: astore #10
/*    */     //   140: new com/intellij/ml/llm/matterhorn/ej/core/actions/ToolActionRequest
/*    */     //   143: dup
/*    */     //   144: aload #7
/*    */     //   146: aload #9
/*    */     //   148: aload #10
/*    */     //   150: aload #8
/*    */     //   152: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V
/*    */     //   155: astore #6
/*    */     //   157: iload_2
/*    */     //   158: ifeq -> 219
/*    */     //   161: getstatic com/intellij/ml/llm/matterhorn/ej/core/actions/ActionProvider.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionProvider$Companion;
/*    */     //   164: aload #6
/*    */     //   166: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest
/*    */     //   169: aload_1
/*    */     //   170: aload_0
/*    */     //   171: getfield availableActions : Ljava/util/List;
/*    */     //   174: aload #12
/*    */     //   176: aload #12
/*    */     //   178: aload #6
/*    */     //   180: putfield L$0 : Ljava/lang/Object;
/*    */     //   183: aload #12
/*    */     //   185: iconst_1
/*    */     //   186: putfield label : I
/*    */     //   189: invokevirtual reviewRequest : (Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   192: dup
/*    */     //   193: aload #13
/*    */     //   195: if_acmpne -> 218
/*    */     //   198: aload #13
/*    */     //   200: areturn
/*    */     //   201: aload #12
/*    */     //   203: getfield L$0 : Ljava/lang/Object;
/*    */     //   206: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/ToolActionRequest
/*    */     //   209: astore #6
/*    */     //   211: aload #11
/*    */     //   213: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   216: aload #11
/*    */     //   218: pop
/*    */     //   219: aload #6
/*    */     //   221: areturn
/*    */     //   222: new java/lang/IllegalStateException
/*    */     //   225: dup
/*    */     //   226: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   228: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   231: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #51	-> 60
/*    */     //   #52	-> 93
/*    */     //   #53	-> 99
/*    */     //   #56	-> 112
/*    */     //   #57	-> 119
/*    */     //   #58	-> 126
/*    */     //   #59	-> 133
/*    */     //   #55	-> 140
/*    */     //   #56	-> 144
/*    */     //   #58	-> 146
/*    */     //   #59	-> 148
/*    */     //   #57	-> 150
/*    */     //   #55	-> 152
/*    */     //   #61	-> 157
/*    */     //   #62	-> 161
/*    */     //   #51	-> 198
/*    */     //   #64	-> 218
/*    */     //   #51	-> 222
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   93	99	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ToolActionProvider;
/*    */     //   93	99	1	executionAgentContext	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*    */     //   93	68	2	doReview	Z
/*    */     //   99	27	4	toolUse	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornAssistantChatMessageWithToolUses;
/*    */     //   112	28	5	toolUsage	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornToolUse;
/*    */     //   157	44	6	actionRequest	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ToolActionRequest;
/*    */     //   211	11	6	actionRequest	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ToolActionRequest;
/*    */     //   0	232	3	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   50	172	12	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	165	11	$result	Ljava/lang/Object;
/*    */   }
/*    */   
/*    */   private static final CharSequence getActionString$lambda$0(Map.Entry paramEntry) {
/*    */     Intrinsics.checkNotNullParameter(paramEntry, "<destruct>");
/*    */     String key = (String)paramEntry.getKey();
/*    */     ParameterValue value = (ParameterValue)paramEntry.getValue();
/*    */     return " - " + key + ": " + value;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String getActionString() {
/* 68 */     MatterhornChatElement message = (MatterhornChatElement)CollectionsKt.last(this.chat.getMessages());
/*    */ 
/*    */     
/* 71 */     MatterhornToolUse toolUsage = (MatterhornToolUse)CollectionsKt.single(((MatterhornAssistantChatMessageWithToolUses)message).getToolUses());
/* 72 */     String paramString = CollectionsKt.joinToString$default(toolUsage.getInput().entrySet(), ",\n", null, null, 0, null, ToolActionProvider::getActionString$lambda$0, 30, null);
/* 73 */     return (message instanceof MatterhornAssistantChatMessageWithToolUses) ? (((MatterhornAssistantChatMessageWithToolUses)message).getContent() + "\ntool name: " + ((MatterhornAssistantChatMessageWithToolUses)message).getContent() + "\ntool parameters:\n" + toolUsage.getName()) : 
/*    */       
/* 75 */       message.getContent();
/*    */   }
/*    */   @NotNull
/*    */   public MatterhornChatElement getObservation() {
/* 79 */     return (MatterhornChatElement)CollectionsKt.last(this.chat.getMessages());
/*    */   }
/*    */   private final MatterhornAssistantChatMessageWithToolUses getToolUse() {
/* 82 */     MatterhornChatElement toolUse = (MatterhornChatElement)CollectionsKt.lastOrNull(this.chat.getMessages());
/* 83 */     if (toolUse == null || !(toolUse instanceof MatterhornAssistantChatMessageWithToolUses)) {
/* 84 */       throw new InvalidContentFormatException("ERROR: Some tool must be used");
/*    */     }
/* 86 */     Iterable<AgentAction> $this$associateBy$iv = this.availableActions; int $i$f$associateBy = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 94 */     int capacity$iv = RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault($this$associateBy$iv, 10)), 16);
/* 95 */     Iterable<AgentAction> iterable1 = $this$associateBy$iv; Map<Object, Object> destination$iv$iv = new LinkedHashMap<>(capacity$iv); int $i$f$associateByTo = 0;
/* 96 */     for (AgentAction element$iv$iv : iterable1) {
/* 97 */       AgentAction agentAction1 = element$iv$iv; Map<Object, Object> map = destination$iv$iv; int $i$a$-associateBy-ToolActionProvider$getToolUse$agentActions$1 = 0; AgentAction it = element$iv$iv; String str = agentAction1.getName(); map = map; int $i$a$-associateBy-ToolActionProvider$getToolUse$agentActions$2 = 0;
/*    */     } 
/* 99 */     Map<Object, Object> agentActions = destination$iv$iv;
/*    */     if (!agentActions.containsKey(((MatterhornToolUse)CollectionsKt.single(((MatterhornAssistantChatMessageWithToolUses)toolUse).getToolUses())).getName()))
/*    */       throw new InvalidContentFormatException("ERROR: Tool name must be valid"); 
/*    */     return (MatterhornAssistantChatMessageWithToolUses)toolUse;
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "ActionProvider.kt", l = {62}, i = {0}, s = {"L$0"}, n = {"actionRequest"}, m = "getAction", c = "com.intellij.ml.llm.matterhorn.ej.core.actions.ToolActionProvider")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   static final class ToolActionProvider$getAction$1 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     int label;
/*    */     
/*    */     ToolActionProvider$getAction$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return ToolActionProvider.this.getAction(null, false, (Continuation<? super ActionRequest>)this);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\actions\ToolActionProvider.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */