/*    */ package com.intellij.ml.llm.matterhorn.core.llm.anthropic;
/*    */ @Serializable
/*    */ @SerialName("error")
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000D\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\b\n\000\n\002\030\002\n\002\b\004\n\002\020\016\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\005\b\007\030\000 \0352\0020\001:\003\033\034\035B\021\b\002\022\006\020\002\032\0020\003¢\006\004\b\004\020\005B%\b\020\022\006\020\006\032\0020\007\022\b\020\002\032\004\030\0010\003\022\b\020\b\032\004\030\0010\t¢\006\004\b\004\020\nJ\b\020\021\032\004\030\0010\022J%\020\023\032\0020\0242\006\020\025\032\0020\0002\006\020\026\032\0020\0272\006\020\030\032\0020\031H\001¢\006\002\b\032R\026\020\002\032\0020\0038\002X\004¢\006\b\n\000\022\004\b\013\020\fR\021\020\r\032\0020\0168F¢\006\006\032\004\b\017\020\020¨\006\036"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicStreamingEvent$Error;", "Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicStreamingEvent;", "payload", "Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicStreamingEvent$Error$Payload;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicStreamingEvent$Error$Payload;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicStreamingEvent$Error$Payload;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getPayload$annotations", "()V", "message", "", "getMessage", "()Ljava/lang/String;", "toHttpStatusCode", "Lio/ktor/http/HttpStatusCode;", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$core_llm", "Payload", "$serializer", "Companion", "core-llm"})
/*    */ @SourceDebugExtension({"SMAP\nAnthropicStreamingEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnthropicStreamingEvent.kt\ncom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicStreamingEvent$Error\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,64:1\n1#2:65\n*E\n"})
/*    */ public final class Error implements AnthropicStreamingEvent { @NotNull
/*    */   public static final Companion Companion = new Companion(null); @NotNull
/*    */   private final Payload payload; @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicStreamingEvent$Error$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicStreamingEvent$Error;", "core-llm"})
/*    */   public static final class Companion { @NotNull
/* 10 */     public final KSerializer<AnthropicStreamingEvent.Error> serializer() { return (KSerializer<AnthropicStreamingEvent.Error>)AnthropicStreamingEvent.Error.$serializer.INSTANCE; } private Companion() {} } private Error(Payload payload) {
/* 11 */     this.payload = payload; } @Serializable @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0006\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\004\n\002\020\b\n\000\n\002\030\002\n\002\b\005\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\003\030\000 \0302\0020\001:\002\027\030B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003¢\006\004\b\005\020\006B/\b\020\022\006\020\007\032\0020\b\022\b\020\002\032\004\030\0010\003\022\b\020\004\032\004\030\0010\003\022\b\020\t\032\004\030\0010\n¢\006\004\b\005\020\013J%\020\017\032\0020\0202\006\020\021\032\0020\0002\006\020\022\032\0020\0232\006\020\024\032\0020\025H\001¢\006\002\b\026R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\f\020\rR\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\016\020\r¨\006\031"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicStreamingEvent$Error$Payload;", "", "type", "", "message", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getType", "()Ljava/lang/String;", "getMessage", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$core_llm", "$serializer", "Companion", "core-llm"}) private static final class Payload { @NotNull public static final Companion Companion = new Companion(null); @NotNull private final String type; @NotNull private final String message; @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicStreamingEvent$Error$Payload$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicStreamingEvent$Error$Payload;", "core-llm"}) public static final class Companion { private Companion() {} @NotNull
/* 12 */       public final KSerializer<AnthropicStreamingEvent.Error.Payload> serializer() { return (KSerializer<AnthropicStreamingEvent.Error.Payload>)AnthropicStreamingEvent.Error.Payload.$serializer.INSTANCE; } } @NotNull
/* 13 */     public final String getMessage() { return this.message; } @NotNull public final String getType() { return this.type; } public Payload(@NotNull String type, @NotNull String message) { this.type = type; this.message = message; } }
/*    */   @NotNull
/* 15 */   public final String getMessage() { return this.payload.getMessage(); } @Nullable
/*    */   public final HttpStatusCode toHttpStatusCode() {
/* 17 */     String str = this.payload.getType(); switch (str.hashCode()) { case 1258890136: if (str.equals("permission_error"));case -1266459263: if (str.equals("authentication_error"));case 1888290719: if (str.equals("not_found_error"));case -88001629: if (str.equals("api_error"));case -656062448: if (str.equals("invalid_request_error"));case 729998245: if (str.equals("rate_limit_error"));case 1300092640: if (str.equals("request_too_large"));case 579677218: if (str.equals("overloaded_error"));default: break; }  Number number = 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 26 */       null;
/* 27 */     int it = ((Number)number).intValue();
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
/* 65 */     int $i$a$-let-AnthropicStreamingEvent$Error$toHttpStatusCode$1 = 0;
/*    */     return (number != null) ? HttpStatusCode.Companion.fromValue(it) : null;
/*    */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\core\llm\anthropic\AnthropicStreamingEvent$Error.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */