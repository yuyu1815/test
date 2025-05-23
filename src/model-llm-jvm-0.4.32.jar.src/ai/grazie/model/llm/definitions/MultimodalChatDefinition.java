/*    */ package ai.grazie.model.llm.definitions;
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000f\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020$\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\n\n\002\020\"\n\002\030\002\n\002\b\b\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\b\b\030\0002\0020\001BC\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022$\b\002\020\b\032\036\022\004\022\0020\n\022\024\022\022\022\004\022\0020\f\022\004\022\0020\f0\013j\002`\r0\t¢\006\002\020\016J\t\020\034\032\0020\003HÆ\003J\t\020\035\032\0020\005HÆ\003J\t\020\036\032\0020\007HÆ\003J%\020\037\032\036\022\004\022\0020\n\022\024\022\022\022\004\022\0020\f\022\004\022\0020\f0\013j\002`\r0\tHÆ\003JM\020 \032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0072$\b\002\020\b\032\036\022\004\022\0020\n\022\024\022\022\022\004\022\0020\f\022\004\022\0020\f0\013j\002`\r0\tHÆ\001J\023\020!\032\0020\"2\b\020#\032\004\030\0010$HÖ\003J\t\020%\032\0020&HÖ\001J\t\020'\032\0020(HÖ\001J\026\020)\032\0020*2\006\020+\032\0020(2\006\020,\032\0020-R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\017\020\020R-\020\b\032\036\022\004\022\0020\n\022\024\022\022\022\004\022\0020\f\022\004\022\0020\f0\013j\002`\r0\t¢\006\b\n\000\032\004\b\021\020\022R\024\020\006\032\0020\007X\004¢\006\b\n\000\032\004\b\023\020\024R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\025\020\026R\027\020\027\032\b\022\004\022\0020\0310\0308F¢\006\006\032\004\b\032\020\033¨\006."}, d2 = {"Lai/grazie/model/llm/definitions/MultimodalChatDefinition;", "Lai/grazie/model/llm/definitions/LLMFeatureDefinition;", "roleDefinition", "Lai/grazie/model/llm/definitions/RoleDefinition;", "mediaDataDefinition", "Lai/grazie/model/llm/definitions/MediaDataDefinition;", "parameterDefinition", "Lai/grazie/model/llm/definitions/ParameterDefinition;", "options", "", "Lai/grazie/utils/attributes/Attributes$Key;", "Lkotlin/Function1;", "Lai/grazie/utils/attributes/Attributes;", "Lai/grazie/model/llm/definitions/OptionConfigurer;", "(Lai/grazie/model/llm/definitions/RoleDefinition;Lai/grazie/model/llm/definitions/MediaDataDefinition;Lai/grazie/model/llm/definitions/ParameterDefinition;Ljava/util/Map;)V", "getMediaDataDefinition", "()Lai/grazie/model/llm/definitions/MediaDataDefinition;", "getOptions", "()Ljava/util/Map;", "getParameterDefinition", "()Lai/grazie/model/llm/definitions/ParameterDefinition;", "getRoleDefinition", "()Lai/grazie/model/llm/definitions/RoleDefinition;", "supportedRoles", "", "Lai/grazie/model/llm/chat/multimodal/LLMMultiModalChatRole;", "getSupportedRoles", "()Ljava/util/Set;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "validateChat", "", "name", "chat", "Lai/grazie/model/llm/chat/multimodal/LLMMultiModalChat;", "model-llm"})
/*    */ public final class MultimodalChatDefinition implements LLMFeatureDefinition {
/*    */   @NotNull
/*    */   private final RoleDefinition roleDefinition;
/*    */   @NotNull
/*    */   private final MediaDataDefinition mediaDataDefinition;
/*    */   
/*  9 */   public MultimodalChatDefinition(@NotNull RoleDefinition roleDefinition, @NotNull MediaDataDefinition mediaDataDefinition, @NotNull ParameterDefinition parameterDefinition, @NotNull Map<Attributes.Key, Function1<Attributes, Attributes>> options) { this.roleDefinition = roleDefinition;
/* 10 */     this.mediaDataDefinition = mediaDataDefinition;
/* 11 */     this.parameterDefinition = parameterDefinition;
/* 12 */     this.options = options; } @NotNull private final ParameterDefinition parameterDefinition; @NotNull private final Map<Attributes.Key, Function1<Attributes, Attributes>> options; @NotNull public final RoleDefinition getRoleDefinition() { return this.roleDefinition; } @NotNull public final MediaDataDefinition getMediaDataDefinition() { return this.mediaDataDefinition; } @NotNull public ParameterDefinition getParameterDefinition() { return this.parameterDefinition; } @NotNull public final Map<Attributes.Key, Function1<Attributes, Attributes>> getOptions() { return this.options; }
/*    */ 
/*    */   
/*    */   public final void validateChat(@NotNull String name, @NotNull LLMMultiModalChat chat) {
/* 16 */     Intrinsics.checkNotNullParameter(name, "name"); Intrinsics.checkNotNullParameter(chat, "chat"); ExtensionsKt.requireOrBadRequest(!chat.getMessages().isEmpty(), MultimodalChatDefinition$validateChat$1.INSTANCE);
/* 17 */     this.roleDefinition.validateMessages(name, chat.getMessages());
/* 18 */     this.mediaDataDefinition.validateMediaData(name, chat);
/*    */   } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\016\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "", "invoke"}) static final class MultimodalChatDefinition$validateChat$1 extends Lambda implements Function0<String> {
/*    */     public static final MultimodalChatDefinition$validateChat$1 INSTANCE = new MultimodalChatDefinition$validateChat$1(); MultimodalChatDefinition$validateChat$1() { super(0); } public final String invoke() { return "Chat messages cannot be empty"; } }
/*    */   @NotNull
/* 22 */   public final Set<LLMMultiModalChatRole> getSupportedRoles() { return this.roleDefinition.getSupportedMultiModalRoles(); }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final RoleDefinition component1() {
/*    */     return this.roleDefinition;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final MediaDataDefinition component2() {
/*    */     return this.mediaDataDefinition;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final ParameterDefinition component3() {
/*    */     return this.parameterDefinition;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Map<Attributes.Key, Function1<Attributes, Attributes>> component4() {
/*    */     return this.options;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final MultimodalChatDefinition copy(@NotNull RoleDefinition roleDefinition, @NotNull MediaDataDefinition mediaDataDefinition, @NotNull ParameterDefinition parameterDefinition, @NotNull Map<Attributes.Key, ? extends Function1<? super Attributes, ? extends Attributes>> options) {
/*    */     Intrinsics.checkNotNullParameter(roleDefinition, "roleDefinition");
/*    */     Intrinsics.checkNotNullParameter(mediaDataDefinition, "mediaDataDefinition");
/*    */     Intrinsics.checkNotNullParameter(parameterDefinition, "parameterDefinition");
/*    */     Intrinsics.checkNotNullParameter(options, "options");
/*    */     return new MultimodalChatDefinition(roleDefinition, mediaDataDefinition, parameterDefinition, options);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "MultimodalChatDefinition(roleDefinition=" + this.roleDefinition + ", mediaDataDefinition=" + this.mediaDataDefinition + ", parameterDefinition=" + this.parameterDefinition + ", options=" + this.options + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.roleDefinition.hashCode();
/*    */     result = result * 31 + this.mediaDataDefinition.hashCode();
/*    */     result = result * 31 + this.parameterDefinition.hashCode();
/*    */     return result * 31 + this.options.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof MultimodalChatDefinition))
/*    */       return false; 
/*    */     MultimodalChatDefinition multimodalChatDefinition = (MultimodalChatDefinition)other;
/*    */     return !Intrinsics.areEqual(this.roleDefinition, multimodalChatDefinition.roleDefinition) ? false : (!Intrinsics.areEqual(this.mediaDataDefinition, multimodalChatDefinition.mediaDataDefinition) ? false : (!Intrinsics.areEqual(this.parameterDefinition, multimodalChatDefinition.parameterDefinition) ? false : (!!Intrinsics.areEqual(this.options, multimodalChatDefinition.options))));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-llm-jvm-0.4.32.jar!\ai\grazie\model\llm\definitions\MultimodalChatDefinition.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */