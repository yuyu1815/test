/*    */ package com.intellij.ml.llm.matterhorn.core.llm.openai;@Serializable
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000>\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\004\n\002\020\b\n\000\n\002\030\002\n\002\b\013\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 #2\0020\001:\002\"#B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003¢\006\004\b\005\020\006B/\b\020\022\006\020\007\032\0020\b\022\b\020\002\032\004\030\0010\003\022\b\020\004\032\004\030\0010\003\022\b\020\t\032\004\030\0010\n¢\006\004\b\005\020\013J\t\020\022\032\0020\003HÆ\003J\t\020\023\032\0020\003HÆ\003J\035\020\024\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\003HÆ\001J\023\020\025\032\0020\0262\b\020\027\032\004\030\0010\001HÖ\003J\t\020\030\032\0020\bHÖ\001J\t\020\031\032\0020\003HÖ\001J%\020\032\032\0020\0332\006\020\034\032\0020\0002\006\020\035\032\0020\0362\006\020\037\032\0020 H\001¢\006\002\b!R\034\020\002\032\0020\0038\006X\004¢\006\016\n\000\022\004\b\f\020\r\032\004\b\016\020\017R\034\020\004\032\0020\0038\006X\004¢\006\016\n\000\022\004\b\020\020\r\032\004\b\021\020\017¨\006$"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAIChatMessage;", "", "role", "", "content", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getRole$annotations", "()V", "getRole", "()Ljava/lang/String;", "getContent$annotations", "getContent", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$core_llm", "$serializer", "Companion", "core-llm"})
/*    */ public final class OpenAIChatMessage { @NotNull
/*    */   public static final Companion Companion = new Companion(null); @NotNull
/*    */   private final String role; @NotNull
/*    */   private final String content; @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAIChatMessage$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAIChatMessage;", "core-llm"})
/*    */   public static final class Companion { @NotNull
/*    */     public final KSerializer<OpenAIChatMessage> serializer() {
/*  9 */       return (KSerializer<OpenAIChatMessage>)OpenAIChatMessage.$serializer.INSTANCE;
/*    */     } private Companion() {} } public OpenAIChatMessage(@NotNull String role, @NotNull String content) {
/* 11 */     this.role = role;
/*    */ 
/*    */     
/* 14 */     this.content = content; } @NotNull public final String getRole() { return this.role; } @NotNull public final String getContent() { return this.content; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final String component1() {
/*    */     return this.role;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component2() {
/*    */     return this.content;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final OpenAIChatMessage copy(@NotNull String role, @NotNull String content) {
/*    */     Intrinsics.checkNotNullParameter(role, "role");
/*    */     Intrinsics.checkNotNullParameter(content, "content");
/*    */     return new OpenAIChatMessage(role, content);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "OpenAIChatMessage(role=" + this.role + ", content=" + this.content + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.role.hashCode();
/*    */     return result * 31 + this.content.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof OpenAIChatMessage))
/*    */       return false; 
/*    */     OpenAIChatMessage openAIChatMessage = (OpenAIChatMessage)other;
/*    */     return !Intrinsics.areEqual(this.role, openAIChatMessage.role) ? false : (!!Intrinsics.areEqual(this.content, openAIChatMessage.content));
/*    */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\core\llm\openai\OpenAIChatMessage.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */