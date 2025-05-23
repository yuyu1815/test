/*   */ package ai.grazie.model.task.library.webCrawl;
/*   */ 
/*   */ @Serializable
/*   */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000<\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\007\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 \0342\0020\001:\002\033\034B#\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007¢\006\002\020\bB\r\022\006\020\004\032\0020\005¢\006\002\020\tJ\t\020\f\032\0020\005HÆ\003J\023\020\r\032\0020\0002\b\b\002\020\004\032\0020\005HÆ\001J\023\020\016\032\0020\0172\b\020\020\032\004\030\0010\001HÖ\003J\t\020\021\032\0020\003HÖ\001J\t\020\022\032\0020\005HÖ\001J&\020\023\032\0020\0242\006\020\025\032\0020\0002\006\020\026\032\0020\0272\006\020\030\032\0020\031HÁ\001¢\006\002\b\032R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\n\020\013¨\006\035"}, d2 = {"Lai/grazie/model/task/library/webCrawl/WebScrapTaskResult;", "", "seen1", "", "html", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;)V", "getHtml", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$model_task", "$serializer", "Companion", "model-task"})
/*   */ public final class WebScrapTaskResult {
/*   */   @NotNull
/*   */   public static final Companion Companion = new Companion(null);
/*   */   
/* 9 */   public WebScrapTaskResult(@NotNull String html) { this.html = html; } @NotNull private final String html; @NotNull public final String getHtml() { return this.html; }
/*   */ 
/*   */   
/*   */   @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*   */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/model/task/library/webCrawl/WebScrapTaskResult.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/model/task/library/webCrawl/WebScrapTaskResult;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-task"})
/*   */   public static final class $serializer implements GeneratedSerializer<WebScrapTaskResult> {
/*   */     @NotNull
/*   */     public static final $serializer INSTANCE = new $serializer();
/*   */     
/*   */     @NotNull
/*   */     public KSerializer<?>[] typeParametersSerializers() {
/*   */       return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
/*   */     }
/*   */     
/*   */     @NotNull
/*   */     public SerialDescriptor getDescriptor() {
/*   */       return (SerialDescriptor)descriptor;
/*   */     }
/*   */     
/*   */     @NotNull
/*   */     public KSerializer<?>[] childSerializers() {
/*   */       KSerializer[] arrayOfKSerializer = new KSerializer[1];
/*   */       arrayOfKSerializer[0] = (KSerializer)StringSerializer.INSTANCE;
/*   */       return (KSerializer<?>[])arrayOfKSerializer;
/*   */     }
/*   */     
/*   */     @NotNull
/*   */     public WebScrapTaskResult deserialize(@NotNull Decoder decoder) {
/*   */       Intrinsics.checkNotNullParameter(decoder, "decoder");
/*   */       SerialDescriptor serialDescriptor = getDescriptor();
/*   */       boolean bool = true;
/*   */       int i = 0;
/*   */       String str = null;
/*   */       CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*   */       if (compositeDecoder.decodeSequentially()) {
/*   */         str = compositeDecoder.decodeStringElement(serialDescriptor, 0);
/*   */         i |= 0x1;
/*   */       } else {
/*   */         while (bool) {
/*   */           int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*   */           switch (j) {
/*   */             case -1:
/*   */               bool = false;
/*   */               continue;
/*   */             case 0:
/*   */               str = compositeDecoder.decodeStringElement(serialDescriptor, 0);
/*   */               i |= 0x1;
/*   */               continue;
/*   */           } 
/*   */           throw new UnknownFieldException(j);
/*   */         } 
/*   */       } 
/*   */       compositeDecoder.endStructure(serialDescriptor);
/*   */       return new WebScrapTaskResult(i, str, null);
/*   */     }
/*   */     
/*   */     public void serialize(@NotNull Encoder encoder, @NotNull WebScrapTaskResult value) {
/*   */       Intrinsics.checkNotNullParameter(encoder, "encoder");
/*   */       Intrinsics.checkNotNullParameter(value, "value");
/*   */       SerialDescriptor serialDescriptor = getDescriptor();
/*   */       CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*   */       WebScrapTaskResult.write$Self$model_task(value, compositeEncoder, serialDescriptor);
/*   */       compositeEncoder.endStructure(serialDescriptor);
/*   */     }
/*   */     
/*   */     static {
/*   */       PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.model.task.library.webCrawl.WebScrapTaskResult", INSTANCE, 1);
/*   */       pluginGeneratedSerialDescriptor.addElement("html", false);
/*   */       descriptor = pluginGeneratedSerialDescriptor;
/*   */     }
/*   */   }
/*   */   
/*   */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/model/task/library/webCrawl/WebScrapTaskResult$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/model/task/library/webCrawl/WebScrapTaskResult;", "model-task"})
/*   */   public static final class Companion {
/*   */     private Companion() {}
/*   */     
/*   */     @NotNull
/*   */     public final KSerializer<WebScrapTaskResult> serializer() {
/*   */       return (KSerializer<WebScrapTaskResult>)WebScrapTaskResult.$serializer.INSTANCE;
/*   */     }
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public final String component1() {
/*   */     return this.html;
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public final WebScrapTaskResult copy(@NotNull String html) {
/*   */     Intrinsics.checkNotNullParameter(html, "html");
/*   */     return new WebScrapTaskResult(html);
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public String toString() {
/*   */     return "WebScrapTaskResult(html=" + this.html + ")";
/*   */   }
/*   */   
/*   */   public int hashCode() {
/*   */     return this.html.hashCode();
/*   */   }
/*   */   
/*   */   public boolean equals(@Nullable Object other) {
/*   */     if (this == other)
/*   */       return true; 
/*   */     if (!(other instanceof WebScrapTaskResult))
/*   */       return false; 
/*   */     WebScrapTaskResult webScrapTaskResult = (WebScrapTaskResult)other;
/*   */     return !!Intrinsics.areEqual(this.html, webScrapTaskResult.html);
/*   */   }
/*   */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\library\webCrawl\WebScrapTaskResult.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */