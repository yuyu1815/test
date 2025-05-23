/*    */ package com.intellij.ml.llm.matterhorn.ej.core.actions;@Serializable
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0006\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\005\n\002\020\b\n\002\b\005\n\002\020$\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\000\bw\030\000 \0242\0020\001:\001\024J\"\020\016\032\016\022\004\022\0020\003\022\004\022\0020\0200\0172\006\020\021\032\0020\022H¦@¢\006\002\020\023R\022\020\002\032\0020\003X¦\004¢\006\006\032\004\b\004\020\005R\022\020\006\032\0020\003X¦\004¢\006\006\032\004\b\007\020\005R\022\020\b\032\0020\tX¦\004¢\006\006\032\004\b\n\020\013R\022\020\f\032\0020\003X¦\004¢\006\006\032\004\b\r\020\005\001\002\025\026¨\006\027"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;", "", "name", "", "getName", "()Ljava/lang/String;", "description", "getDescription", "numCommands", "", "getNumCommands", "()I", "title", "getTitle", "getInputParameters", "", "Lcom/intellij/ml/llm/matterhorn/llm/ParameterValue;", "action", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentAction;", "(Lcom/intellij/ml/llm/matterhorn/ej/core/AgentAction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/SimpleActionRequest;", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ToolActionRequest;", "ej-core"})
/*    */ public interface ActionRequest { @NotNull
/*    */   public static final Companion Companion = Companion.$$INSTANCE; @NotNull
/*    */   String getName();
/*    */   @NotNull
/*    */   String getDescription();
/*    */   int getNumCommands();
/*    */   @NotNull
/*    */   String getTitle();
/*    */   @Nullable
/*    */   Object getInputParameters(@NotNull AgentAction paramAgentAction, @NotNull Continuation<? super Map<String, ParameterValue>> paramContinuation);
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;", "ej-core"})
/*    */   public static final class Companion { @NotNull
/*    */     public final KSerializer<ActionRequest> serializer() {
/* 16 */       KClass[] arrayOfKClass = new KClass[2]; arrayOfKClass[0] = Reflection.getOrCreateKotlinClass(SimpleActionRequest.class); arrayOfKClass[1] = Reflection.getOrCreateKotlinClass(ToolActionRequest.class); KSerializer[] arrayOfKSerializer = new KSerializer[2]; arrayOfKSerializer[0] = (KSerializer)SimpleActionRequest.$serializer.INSTANCE; arrayOfKSerializer[1] = (KSerializer)ToolActionRequest.$serializer.INSTANCE; return (KSerializer<ActionRequest>)new SealedClassSerializer("com.intellij.ml.llm.matterhorn.ej.core.actions.ActionRequest", Reflection.getOrCreateKotlinClass(ActionRequest.class), arrayOfKClass, arrayOfKSerializer, new java.lang.annotation.Annotation[0]);
/*    */     } }
/*    */    }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\actions\ActionRequest.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */