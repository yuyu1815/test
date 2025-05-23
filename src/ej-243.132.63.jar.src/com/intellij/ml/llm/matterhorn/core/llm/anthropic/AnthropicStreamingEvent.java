/*    */ package com.intellij.ml.llm.matterhorn.core.llm.anthropic;
/*    */ @Serializable
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\020\000\n\002\b\t\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\bw\030\000 \n2\0020\001:\t\002\003\004\005\006\007\b\t\n\001\b\013\f\r\016\017\020\021\022¨\006\023"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicStreamingEvent;", "", "Error", "Ping", "MessageStart", "MessageDelta", "MessageStop", "ContentBlockStart", "ContentBlockDelta", "ContentBlockStop", "Companion", "Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicStreamingEvent$ContentBlockDelta;", "Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicStreamingEvent$ContentBlockStart;", "Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicStreamingEvent$ContentBlockStop;", "Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicStreamingEvent$Error;", "Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicStreamingEvent$MessageDelta;", "Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicStreamingEvent$MessageStart;", "Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicStreamingEvent$MessageStop;", "Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicStreamingEvent$Ping;", "core-llm"})
/*    */ public interface AnthropicStreamingEvent { @NotNull
/*    */   public static final Companion Companion = Companion.$$INSTANCE;
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicStreamingEvent$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicStreamingEvent;", "core-llm"})
/*    */   public static final class Companion { @NotNull
/*  8 */     public final KSerializer<AnthropicStreamingEvent> serializer() { KClass[] arrayOfKClass = new KClass[8]; arrayOfKClass[0] = Reflection.getOrCreateKotlinClass(AnthropicStreamingEvent.ContentBlockDelta.class); arrayOfKClass[1] = Reflection.getOrCreateKotlinClass(AnthropicStreamingEvent.ContentBlockStart.class); arrayOfKClass[2] = Reflection.getOrCreateKotlinClass(AnthropicStreamingEvent.ContentBlockStop.class); arrayOfKClass[3] = Reflection.getOrCreateKotlinClass(AnthropicStreamingEvent.Error.class); arrayOfKClass[4] = Reflection.getOrCreateKotlinClass(AnthropicStreamingEvent.MessageDelta.class); arrayOfKClass[5] = Reflection.getOrCreateKotlinClass(AnthropicStreamingEvent.MessageStart.class); arrayOfKClass[6] = Reflection.getOrCreateKotlinClass(AnthropicStreamingEvent.MessageStop.class); arrayOfKClass[7] = Reflection.getOrCreateKotlinClass(AnthropicStreamingEvent.Ping.class); KSerializer[] arrayOfKSerializer = new KSerializer[8]; arrayOfKSerializer[0] = (KSerializer)AnthropicStreamingEvent.ContentBlockDelta.$serializer.INSTANCE; arrayOfKSerializer[1] = (KSerializer)AnthropicStreamingEvent.ContentBlockStart.$serializer.INSTANCE; arrayOfKSerializer[2] = (KSerializer)AnthropicStreamingEvent.ContentBlockStop.$serializer.INSTANCE; arrayOfKSerializer[3] = (KSerializer)AnthropicStreamingEvent.Error.$serializer.INSTANCE; arrayOfKSerializer[4] = (KSerializer)AnthropicStreamingEvent.MessageDelta.$serializer.INSTANCE; arrayOfKSerializer[5] = (KSerializer)AnthropicStreamingEvent.MessageStart.$serializer.INSTANCE; arrayOfKSerializer[6] = (KSerializer)new ObjectSerializer("message_stop", AnthropicStreamingEvent.MessageStop.INSTANCE, new java.lang.annotation.Annotation[0]); arrayOfKSerializer[7] = (KSerializer)new ObjectSerializer("ping", AnthropicStreamingEvent.Ping.INSTANCE, new java.lang.annotation.Annotation[0]); return (KSerializer<AnthropicStreamingEvent>)new SealedClassSerializer("com.intellij.ml.llm.matterhorn.core.llm.anthropic.AnthropicStreamingEvent", Reflection.getOrCreateKotlinClass(AnthropicStreamingEvent.class), arrayOfKClass, arrayOfKSerializer, new java.lang.annotation.Annotation[0]); } } @Serializable @SerialName("error") @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000D\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\b\n\000\n\002\030\002\n\002\b\004\n\002\020\016\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\005\b\007\030\000 \0352\0020\001:\003\033\034\035B\021\b\002\022\006\020\002\032\0020\003¢\006\004\b\004\020\005B%\b\020\022\006\020\006\032\0020\007\022\b\020\002\032\004\030\0010\003\022\b\020\b\032\004\030\0010\t¢\006\004\b\004\020\nJ\b\020\021\032\004\030\0010\022J%\020\023\032\0020\0242\006\020\025\032\0020\0002\006\020\026\032\0020\0272\006\020\030\032\0020\031H\001¢\006\002\b\032R\026\020\002\032\0020\0038\002X\004¢\006\b\n\000\022\004\b\013\020\fR\021\020\r\032\0020\0168F¢\006\006\032\004\b\017\020\020¨\006\036"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicStreamingEvent$Error;", "Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicStreamingEvent;", "payload", "Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicStreamingEvent$Error$Payload;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicStreamingEvent$Error$Payload;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicStreamingEvent$Error$Payload;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getPayload$annotations", "()V", "message", "", "getMessage", "()Ljava/lang/String;", "toHttpStatusCode", "Lio/ktor/http/HttpStatusCode;", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$core_llm", "Payload", "$serializer", "Companion", "core-llm"}) @SourceDebugExtension({"SMAP\nAnthropicStreamingEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnthropicStreamingEvent.kt\ncom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicStreamingEvent$Error\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,64:1\n1#2:65\n*E\n"}) public static final class Error implements AnthropicStreamingEvent { @NotNull public static final Companion Companion = new Companion(null); @NotNull private final Payload payload; @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicStreamingEvent$Error$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicStreamingEvent$Error;", "core-llm"})
/*    */     public static final class Companion { private Companion() {} @NotNull
/* 10 */       public final KSerializer<AnthropicStreamingEvent.Error> serializer() { return (KSerializer<AnthropicStreamingEvent.Error>)AnthropicStreamingEvent.Error.$serializer.INSTANCE; } }
/* 11 */      private Error(Payload payload) { this.payload = payload; } @Serializable @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0006\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\004\n\002\020\b\n\000\n\002\030\002\n\002\b\005\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\003\030\000 \0302\0020\001:\002\027\030B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003¢\006\004\b\005\020\006B/\b\020\022\006\020\007\032\0020\b\022\b\020\002\032\004\030\0010\003\022\b\020\004\032\004\030\0010\003\022\b\020\t\032\004\030\0010\n¢\006\004\b\005\020\013J%\020\017\032\0020\0202\006\020\021\032\0020\0002\006\020\022\032\0020\0232\006\020\024\032\0020\025H\001¢\006\002\b\026R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\f\020\rR\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\016\020\r¨\006\031"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicStreamingEvent$Error$Payload;", "", "type", "", "message", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getType", "()Ljava/lang/String;", "getMessage", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$core_llm", "$serializer", "Companion", "core-llm"}) private static final class Payload { @NotNull public static final Companion Companion = new Companion(null); @NotNull private final String type; @NotNull private final String message; @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicStreamingEvent$Error$Payload$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicStreamingEvent$Error$Payload;", "core-llm"}) public static final class Companion { private Companion() {} @NotNull
/* 12 */         public final KSerializer<AnthropicStreamingEvent.Error.Payload> serializer() { return (KSerializer<AnthropicStreamingEvent.Error.Payload>)AnthropicStreamingEvent.Error.Payload.$serializer.INSTANCE; } } @NotNull
/* 13 */       public final String getMessage() { return this.message; } @NotNull public final String getType() { return this.type; } public Payload(@NotNull String type, @NotNull String message) { this.type = type; this.message = message; } }
/*    */      @NotNull
/* 15 */     public final String getMessage() { return this.payload.getMessage(); } @Nullable
/*    */     public final HttpStatusCode toHttpStatusCode() {
/* 17 */       String str = this.payload.getType(); switch (str.hashCode()) { case 1258890136: if (str.equals("permission_error"));case -1266459263: if (str.equals("authentication_error"));case 1888290719: if (str.equals("not_found_error"));case -88001629: if (str.equals("api_error"));case -656062448: if (str.equals("invalid_request_error"));case 729998245: if (str.equals("rate_limit_error"));case 1300092640: if (str.equals("request_too_large"));case 579677218: if (str.equals("overloaded_error"));default: break; }  Number number = 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */         
/* 26 */         null;
/* 27 */       int it = ((Number)number).intValue();
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
/* 65 */       int $i$a$-let-AnthropicStreamingEvent$Error$toHttpStatusCode$1 = 0;
/*    */       return (number != null) ? HttpStatusCode.Companion.fromValue(it) : null;
/*    */     } }
/*    */ 
/*    */   
/*    */   @Serializable
/*    */   @SerialName("ping")
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\bÇ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0000\005¨\006\006"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicStreamingEvent$Ping;", "Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicStreamingEvent;", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "core-llm"})
/*    */   public static final class Ping implements AnthropicStreamingEvent {
/*    */     @NotNull
/*    */     public static final Ping INSTANCE = new Ping();
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<Ping> serializer() {
/*    */       return get$cachedSerializer();
/*    */     }
/*    */   }
/*    */   
/*    */   @Serializable
/*    */   @SerialName("message_start")
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0006\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\b\n\000\n\002\030\002\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\007\030\000 \0262\0020\001:\002\025\026B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005B%\b\020\022\006\020\006\032\0020\007\022\b\020\002\032\004\030\0010\003\022\b\020\b\032\004\030\0010\t¢\006\004\b\004\020\nJ%\020\r\032\0020\0162\006\020\017\032\0020\0002\006\020\020\032\0020\0212\006\020\022\032\0020\023H\001¢\006\002\b\024R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\013\020\f¨\006\027"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicStreamingEvent$MessageStart;", "Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicStreamingEvent;", "message", "Lkotlinx/serialization/json/JsonObject;", "<init>", "(Lkotlinx/serialization/json/JsonObject;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILkotlinx/serialization/json/JsonObject;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getMessage", "()Lkotlinx/serialization/json/JsonObject;", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$core_llm", "$serializer", "Companion", "core-llm"})
/*    */   public static final class MessageStart implements AnthropicStreamingEvent {
/*    */     @NotNull
/*    */     public static final Companion Companion = new Companion(null);
/*    */     @NotNull
/*    */     private final JsonObject message;
/*    */     
/*    */     @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicStreamingEvent$MessageStart$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicStreamingEvent$MessageStart;", "core-llm"})
/*    */     public static final class Companion {
/*    */       private Companion() {}
/*    */       
/*    */       @NotNull
/*    */       public final KSerializer<AnthropicStreamingEvent.MessageStart> serializer() {
/*    */         return (KSerializer<AnthropicStreamingEvent.MessageStart>)AnthropicStreamingEvent.MessageStart.$serializer.INSTANCE;
/*    */       }
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final JsonObject getMessage() {
/*    */       return this.message;
/*    */     }
/*    */     
/*    */     public MessageStart(@NotNull JsonObject message) {
/*    */       this.message = message;
/*    */     }
/*    */   }
/*    */   
/*    */   @Serializable
/*    */   @SerialName("message_delta")
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000<\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\b\n\000\n\002\030\002\n\002\b\006\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\006\b\007\030\000 \0342\0020\001:\004\031\032\033\034B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007B/\b\020\022\006\020\b\032\0020\t\022\b\020\002\032\004\030\0010\003\022\b\020\004\032\004\030\0010\005\022\b\020\n\032\004\030\0010\013¢\006\004\b\006\020\fJ%\020\021\032\0020\0222\006\020\023\032\0020\0002\006\020\024\032\0020\0252\006\020\026\032\0020\027H\001¢\006\002\b\030R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\r\020\016R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\017\020\020¨\006\035"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicStreamingEvent$MessageDelta;", "Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicStreamingEvent;", "delta", "Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicStreamingEvent$MessageDelta$Delta;", "usage", "Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicStreamingEvent$MessageDelta$Usage;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicStreamingEvent$MessageDelta$Delta;Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicStreamingEvent$MessageDelta$Usage;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicStreamingEvent$MessageDelta$Delta;Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicStreamingEvent$MessageDelta$Usage;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getDelta", "()Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicStreamingEvent$MessageDelta$Delta;", "getUsage", "()Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicStreamingEvent$MessageDelta$Usage;", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$core_llm", "Delta", "Usage", "$serializer", "Companion", "core-llm"})
/*    */   public static final class MessageDelta implements AnthropicStreamingEvent {
/*    */     @NotNull
/*    */     public static final Companion Companion = new Companion(null);
/*    */     @NotNull
/*    */     private final Delta delta;
/*    */     @NotNull
/*    */     private final Usage usage;
/*    */     
/*    */     @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicStreamingEvent$MessageDelta$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicStreamingEvent$MessageDelta;", "core-llm"})
/*    */     public static final class Companion {
/*    */       private Companion() {}
/*    */       
/*    */       @NotNull
/*    */       public final KSerializer<AnthropicStreamingEvent.MessageDelta> serializer() {
/*    */         return (KSerializer<AnthropicStreamingEvent.MessageDelta>)AnthropicStreamingEvent.MessageDelta.$serializer.INSTANCE;
/*    */       }
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final Usage getUsage() {
/*    */       return this.usage;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final Delta getDelta() {
/*    */       return this.delta;
/*    */     }
/*    */     
/*    */     public MessageDelta(@NotNull Delta delta, @NotNull Usage usage) {
/*    */       this.delta = delta;
/*    */       this.usage = usage;
/*    */     }
/*    */     
/*    */     @Serializable
/*    */     @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000<\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\003\n\002\020\b\n\000\n\002\030\002\n\002\b\t\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\007\030\000 \0352\0020\001:\002\034\035B\031\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005¢\006\004\b\006\020\007B/\b\020\022\006\020\b\032\0020\t\022\b\020\002\032\004\030\0010\003\022\b\020\004\032\004\030\0010\005\022\b\020\n\032\004\030\0010\013¢\006\004\b\006\020\fJ%\020\024\032\0020\0252\006\020\026\032\0020\0002\006\020\027\032\0020\0302\006\020\031\032\0020\032H\001¢\006\002\b\033R\034\020\002\032\0020\0038\006X\004¢\006\016\n\000\022\004\b\r\020\016\032\004\b\017\020\020R\036\020\004\032\004\030\0010\0058\006X\004¢\006\016\n\000\022\004\b\021\020\016\032\004\b\022\020\023¨\006\036"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicStreamingEvent$MessageDelta$Delta;", "", "stopReason", "Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicStopReason;", "stopSequence", "", "<init>", "(Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicStopReason;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicStopReason;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getStopReason$annotations", "()V", "getStopReason", "()Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicStopReason;", "getStopSequence$annotations", "getStopSequence", "()Ljava/lang/String;", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$core_llm", "$serializer", "Companion", "core-llm"})
/*    */     public static final class Delta {
/*    */       @NotNull
/*    */       public static final Companion Companion = new Companion(null);
/*    */       @NotNull
/*    */       private final AnthropicStopReason stopReason;
/*    */       @Nullable
/*    */       private final String stopSequence;
/*    */       @JvmField
/*    */       @NotNull
/*    */       private static final KSerializer<Object>[] $childSerializers;
/*    */       
/*    */       static {
/*    */         KSerializer[] arrayOfKSerializer = new KSerializer[2];
/*    */         arrayOfKSerializer[0] = AnthropicStopReason.Companion.serializer();
/*    */         arrayOfKSerializer[1] = null;
/*    */         $childSerializers = (KSerializer<Object>[])arrayOfKSerializer;
/*    */       }
/*    */       
/*    */       @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicStreamingEvent$MessageDelta$Delta$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicStreamingEvent$MessageDelta$Delta;", "core-llm"})
/*    */       public static final class Companion {
/*    */         private Companion() {}
/*    */         
/*    */         @NotNull
/*    */         public final KSerializer<AnthropicStreamingEvent.MessageDelta.Delta> serializer() {
/*    */           return (KSerializer<AnthropicStreamingEvent.MessageDelta.Delta>)AnthropicStreamingEvent.MessageDelta.Delta.$serializer.INSTANCE;
/*    */         }
/*    */       }
/*    */       
/*    */       @Nullable
/*    */       public final String getStopSequence() {
/*    */         return this.stopSequence;
/*    */       }
/*    */       
/*    */       @NotNull
/*    */       public final AnthropicStopReason getStopReason() {
/*    */         return this.stopReason;
/*    */       }
/*    */       
/*    */       public Delta(@NotNull AnthropicStopReason stopReason, @Nullable String stopSequence) {
/*    */         this.stopReason = stopReason;
/*    */         this.stopSequence = stopSequence;
/*    */       }
/*    */     }
/*    */     
/*    */     @Serializable
/*    */     @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0006\n\002\030\002\n\002\020\000\n\000\n\002\020\t\n\002\b\003\n\002\020\b\n\000\n\002\030\002\n\002\b\006\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\007\030\000 \0302\0020\001:\002\027\030B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005B#\b\020\022\006\020\006\032\0020\007\022\006\020\002\032\0020\003\022\b\020\b\032\004\030\0010\t¢\006\004\b\004\020\nJ%\020\017\032\0020\0202\006\020\021\032\0020\0002\006\020\022\032\0020\0232\006\020\024\032\0020\025H\001¢\006\002\b\026R\034\020\002\032\0020\0038\006X\004¢\006\016\n\000\022\004\b\013\020\f\032\004\b\r\020\016¨\006\031"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicStreamingEvent$MessageDelta$Usage;", "", "outputTokens", "", "<init>", "(J)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IJLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getOutputTokens$annotations", "()V", "getOutputTokens", "()J", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$core_llm", "$serializer", "Companion", "core-llm"})
/*    */     public static final class Usage {
/*    */       @NotNull
/*    */       public static final Companion Companion = new Companion(null);
/*    */       private final long outputTokens;
/*    */       
/*    */       @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicStreamingEvent$MessageDelta$Usage$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicStreamingEvent$MessageDelta$Usage;", "core-llm"})
/*    */       public static final class Companion {
/*    */         private Companion() {}
/*    */         
/*    */         @NotNull
/*    */         public final KSerializer<AnthropicStreamingEvent.MessageDelta.Usage> serializer() {
/*    */           return (KSerializer<AnthropicStreamingEvent.MessageDelta.Usage>)AnthropicStreamingEvent.MessageDelta.Usage.$serializer.INSTANCE;
/*    */         }
/*    */       }
/*    */       
/*    */       public final long getOutputTokens() {
/*    */         return this.outputTokens;
/*    */       }
/*    */       
/*    */       public Usage(long outputTokens) {
/*    */         this.outputTokens = outputTokens;
/*    */       }
/*    */     }
/*    */   }
/*    */   
/*    */   @Serializable
/*    */   @SerialName("message_stop")
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\bÇ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0000\005¨\006\006"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicStreamingEvent$MessageStop;", "Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicStreamingEvent;", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "core-llm"})
/*    */   public static final class MessageStop implements AnthropicStreamingEvent {
/*    */     @NotNull
/*    */     public static final MessageStop INSTANCE = new MessageStop();
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<MessageStop> serializer() {
/*    */       return get$cachedSerializer();
/*    */     }
/*    */   }
/*    */   
/*    */   @Serializable
/*    */   @SerialName("content_block_start")
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0006\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\b\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\007\030\000 \0332\0020\001:\002\032\033B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007B-\b\020\022\006\020\b\032\0020\003\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\t\032\004\030\0010\n¢\006\004\b\006\020\013J%\020\022\032\0020\0232\006\020\024\032\0020\0002\006\020\025\032\0020\0262\006\020\027\032\0020\030H\001¢\006\002\b\031R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\f\020\rR\034\020\004\032\0020\0058\006X\004¢\006\016\n\000\022\004\b\016\020\017\032\004\b\020\020\021¨\006\034"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicStreamingEvent$ContentBlockStart;", "Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicStreamingEvent;", "index", "", "contentBlock", "Lkotlinx/serialization/json/JsonObject;", "<init>", "(ILkotlinx/serialization/json/JsonObject;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IILkotlinx/serialization/json/JsonObject;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getIndex", "()I", "getContentBlock$annotations", "()V", "getContentBlock", "()Lkotlinx/serialization/json/JsonObject;", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$core_llm", "$serializer", "Companion", "core-llm"})
/*    */   public static final class ContentBlockStart implements AnthropicStreamingEvent {
/*    */     @NotNull
/*    */     public static final Companion Companion = new Companion(null);
/*    */     private final int index;
/*    */     @NotNull
/*    */     private final JsonObject contentBlock;
/*    */     
/*    */     @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicStreamingEvent$ContentBlockStart$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicStreamingEvent$ContentBlockStart;", "core-llm"})
/*    */     public static final class Companion {
/*    */       private Companion() {}
/*    */       
/*    */       @NotNull
/*    */       public final KSerializer<AnthropicStreamingEvent.ContentBlockStart> serializer() {
/*    */         return (KSerializer<AnthropicStreamingEvent.ContentBlockStart>)AnthropicStreamingEvent.ContentBlockStart.$serializer.INSTANCE;
/*    */       }
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final JsonObject getContentBlock() {
/*    */       return this.contentBlock;
/*    */     }
/*    */     
/*    */     public final int getIndex() {
/*    */       return this.index;
/*    */     }
/*    */     
/*    */     public ContentBlockStart(int index, @NotNull JsonObject contentBlock) {
/*    */       this.index = index;
/*    */       this.contentBlock = contentBlock;
/*    */     }
/*    */   }
/*    */   
/*    */   @Serializable
/*    */   @SerialName("content_block_delta")
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0006\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\006\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\007\030\000 \0312\0020\001:\002\030\031B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007B-\b\020\022\006\020\b\032\0020\003\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\t\032\004\030\0010\n¢\006\004\b\006\020\013J%\020\020\032\0020\0212\006\020\022\032\0020\0002\006\020\023\032\0020\0242\006\020\025\032\0020\026H\001¢\006\002\b\027R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\f\020\rR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\016\020\017¨\006\032"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicStreamingEvent$ContentBlockDelta;", "Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicStreamingEvent;", "index", "", "delta", "Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/ContentDelta;", "<init>", "(ILcom/intellij/ml/llm/matterhorn/core/llm/anthropic/ContentDelta;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IILcom/intellij/ml/llm/matterhorn/core/llm/anthropic/ContentDelta;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getIndex", "()I", "getDelta", "()Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/ContentDelta;", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$core_llm", "$serializer", "Companion", "core-llm"})
/*    */   public static final class ContentBlockDelta implements AnthropicStreamingEvent {
/*    */     @NotNull
/*    */     public static final Companion Companion = new Companion(null);
/*    */     private final int index;
/*    */     @NotNull
/*    */     private final ContentDelta delta;
/*    */     @JvmField
/*    */     @NotNull
/*    */     private static final KSerializer<Object>[] $childSerializers;
/*    */     
/*    */     static {
/*    */       KSerializer[] arrayOfKSerializer1 = new KSerializer[2];
/*    */       arrayOfKSerializer1[0] = null;
/*    */       KClass[] arrayOfKClass = new KClass[2];
/*    */       arrayOfKClass[0] = Reflection.getOrCreateKotlinClass(ContentDelta.InputJson.class);
/*    */       arrayOfKClass[1] = Reflection.getOrCreateKotlinClass(ContentDelta.Text.class);
/*    */       KSerializer[] arrayOfKSerializer2 = new KSerializer[2];
/*    */       arrayOfKSerializer2[0] = (KSerializer)ContentDelta.InputJson.$serializer.INSTANCE;
/*    */       arrayOfKSerializer2[1] = (KSerializer)ContentDelta.Text.$serializer.INSTANCE;
/*    */       arrayOfKSerializer1[1] = (KSerializer)new SealedClassSerializer("com.intellij.ml.llm.matterhorn.core.llm.anthropic.ContentDelta", Reflection.getOrCreateKotlinClass(ContentDelta.class), arrayOfKClass, arrayOfKSerializer2, new java.lang.annotation.Annotation[0]);
/*    */       $childSerializers = (KSerializer<Object>[])arrayOfKSerializer1;
/*    */     }
/*    */     
/*    */     @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicStreamingEvent$ContentBlockDelta$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicStreamingEvent$ContentBlockDelta;", "core-llm"})
/*    */     public static final class Companion {
/*    */       private Companion() {}
/*    */       
/*    */       @NotNull
/*    */       public final KSerializer<AnthropicStreamingEvent.ContentBlockDelta> serializer() {
/*    */         return (KSerializer<AnthropicStreamingEvent.ContentBlockDelta>)AnthropicStreamingEvent.ContentBlockDelta.$serializer.INSTANCE;
/*    */       }
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final ContentDelta getDelta() {
/*    */       return this.delta;
/*    */     }
/*    */     
/*    */     public final int getIndex() {
/*    */       return this.index;
/*    */     }
/*    */     
/*    */     public ContentBlockDelta(int index, @NotNull ContentDelta delta) {
/*    */       this.index = index;
/*    */       this.delta = delta;
/*    */     }
/*    */   }
/*    */   
/*    */   @Serializable
/*    */   @SerialName("content_block_stop")
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\002\b\004\n\002\030\002\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\007\030\000 \0252\0020\001:\002\024\025B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005B#\b\020\022\006\020\006\032\0020\003\022\006\020\002\032\0020\003\022\b\020\007\032\004\030\0010\b¢\006\004\b\004\020\tJ%\020\f\032\0020\r2\006\020\016\032\0020\0002\006\020\017\032\0020\0202\006\020\021\032\0020\022H\001¢\006\002\b\023R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\n\020\013¨\006\026"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicStreamingEvent$ContentBlockStop;", "Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicStreamingEvent;", "index", "", "<init>", "(I)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getIndex", "()I", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$core_llm", "$serializer", "Companion", "core-llm"})
/*    */   public static final class ContentBlockStop implements AnthropicStreamingEvent {
/*    */     @NotNull
/*    */     public static final Companion Companion = new Companion(null);
/*    */     private final int index;
/*    */     
/*    */     @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicStreamingEvent$ContentBlockStop$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicStreamingEvent$ContentBlockStop;", "core-llm"})
/*    */     public static final class Companion {
/*    */       private Companion() {}
/*    */       
/*    */       @NotNull
/*    */       public final KSerializer<AnthropicStreamingEvent.ContentBlockStop> serializer() {
/*    */         return (KSerializer<AnthropicStreamingEvent.ContentBlockStop>)AnthropicStreamingEvent.ContentBlockStop.$serializer.INSTANCE;
/*    */       }
/*    */     }
/*    */     
/*    */     public final int getIndex() {
/*    */       return this.index;
/*    */     }
/*    */     
/*    */     public ContentBlockStop(int index) {
/*    */       this.index = index;
/*    */     }
/*    */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\core\llm\anthropic\AnthropicStreamingEvent.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */