/*    */ package com.intellij.ml.llm.matterhorn.core.llm.openai;@Serializable @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0008\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\002\n\002\020\b\n\002\b\t\n\002\030\002\n\002\b\025\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\007\030\000 .2\0020\001:\002-.BW\022\006\020\002\032\0020\003\022\b\b\002\020\004\032\0020\003\022\b\b\002\020\005\032\0020\006\022\b\b\002\020\007\032\0020\003\022\b\b\002\020\b\032\0020\003\022\b\b\002\020\t\032\0020\003\022\b\b\002\020\n\032\0020\003\022\n\b\002\020\013\032\004\030\0010\003¢\006\004\b\f\020\rBi\b\020\022\006\020\016\032\0020\006\022\b\020\002\032\004\030\0010\003\022\b\020\004\032\004\030\0010\003\022\006\020\005\032\0020\006\022\b\020\007\032\004\030\0010\003\022\b\020\b\032\004\030\0010\003\022\b\020\t\032\004\030\0010\003\022\b\020\n\032\004\030\0010\003\022\b\020\013\032\004\030\0010\003\022\b\020\017\032\004\030\0010\020¢\006\004\b\f\020\021J%\020%\032\0020&2\006\020'\032\0020\0002\006\020(\032\0020)2\006\020*\032\0020+H\001¢\006\002\b,R\034\020\002\032\0020\0038\006X\004¢\006\016\n\000\022\004\b\022\020\023\032\004\b\024\020\025R\034\020\004\032\0020\0038\006X\004¢\006\016\n\000\022\004\b\026\020\023\032\004\b\027\020\025R\034\020\005\032\0020\0068\006X\004¢\006\016\n\000\022\004\b\030\020\023\032\004\b\031\020\032R\034\020\007\032\0020\0038\006X\004¢\006\016\n\000\022\004\b\033\020\023\032\004\b\034\020\025R\034\020\b\032\0020\0038\006X\004¢\006\016\n\000\022\004\b\035\020\023\032\004\b\036\020\025R\034\020\t\032\0020\0038\006X\004¢\006\016\n\000\022\004\b\037\020\023\032\004\b \020\025R\034\020\n\032\0020\0038\006X\004¢\006\016\n\000\022\004\b!\020\023\032\004\b\"\020\025R\036\020\013\032\004\030\0010\0038\006X\004¢\006\016\n\000\022\004\b#\020\023\032\004\b$\020\025¨\006/"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAiImageRequestBody;", "", "prompt", "", "model", "n", "", "quality", "responseFormat", "size", "style", "user", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getPrompt$annotations", "()V", "getPrompt", "()Ljava/lang/String;", "getModel$annotations", "getModel", "getN$annotations", "getN", "()I", "getQuality$annotations", "getQuality", "getResponseFormat$annotations", "getResponseFormat", "getSize$annotations", "getSize", "getStyle$annotations", "getStyle", "getUser$annotations", "getUser", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$core_llm", "$serializer", "Companion", "core-llm"})
/*    */ public final class OpenAiImageRequestBody { @NotNull
/*    */   public static final Companion Companion = new Companion(null); @NotNull
/*    */   private final String prompt; @NotNull
/*    */   private final String model; private final int n; @NotNull
/*    */   private final String quality; @NotNull
/*    */   private final String responseFormat; @NotNull
/*    */   private final String size; @NotNull
/*    */   private final String style; @Nullable
/*    */   private final String user; @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAiImageRequestBody$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAiImageRequestBody;", "core-llm"})
/*    */   public static final class Companion { @NotNull
/* 12 */     public final KSerializer<OpenAiImageRequestBody> serializer() { return (KSerializer<OpenAiImageRequestBody>)OpenAiImageRequestBody.$serializer.INSTANCE; }
/*    */     
/*    */     private Companion() {} }
/*    */   public OpenAiImageRequestBody(@NotNull String prompt, @NotNull String model, int n, @NotNull String quality, @NotNull String responseFormat, @NotNull String size, @NotNull String style, @Nullable String user) {
/* 16 */     this.prompt = prompt;
/*    */ 
/*    */     
/* 19 */     this.model = model;
/*    */ 
/*    */     
/* 22 */     this.n = n;
/*    */ 
/*    */     
/* 25 */     this.quality = quality;
/*    */ 
/*    */     
/* 28 */     this.responseFormat = responseFormat;
/*    */ 
/*    */     
/* 31 */     this.size = size;
/*    */ 
/*    */     
/* 34 */     this.style = style;
/*    */ 
/*    */     
/* 37 */     this.user = user; } @NotNull public final String getPrompt() { return this.prompt; } @NotNull public final String getModel() { return this.model; } public final int getN() { return this.n; } @NotNull public final String getQuality() { return this.quality; } @NotNull public final String getResponseFormat() { return this.responseFormat; } @NotNull public final String getSize() { return this.size; } @NotNull public final String getStyle() { return this.style; } @Nullable public final String getUser() { return this.user; }
/*    */    }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\core\llm\openai\OpenAiImageRequestBody.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */