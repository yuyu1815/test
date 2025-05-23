/*    */ package ai.grazie.model.task.library.webSearch;
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000F\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\002\b\n\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\005\b\b\030\000 \"2\0020\001:\003!\"#B3\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\016\020\006\032\n\022\004\022\0020\b\030\0010\007\022\b\020\t\032\004\030\0010\n¢\006\002\020\013B\033\022\006\020\004\032\0020\005\022\f\020\006\032\b\022\004\022\0020\b0\007¢\006\002\020\fJ\t\020\021\032\0020\005HÆ\003J\017\020\022\032\b\022\004\022\0020\b0\007HÆ\003J#\020\023\032\0020\0002\b\b\002\020\004\032\0020\0052\016\b\002\020\006\032\b\022\004\022\0020\b0\007HÆ\001J\023\020\024\032\0020\0252\b\020\026\032\004\030\0010\001HÖ\003J\t\020\027\032\0020\003HÖ\001J\t\020\030\032\0020\005HÖ\001J&\020\031\032\0020\0322\006\020\033\032\0020\0002\006\020\034\032\0020\0352\006\020\036\032\0020\037HÁ\001¢\006\002\b R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\r\020\016R\027\020\006\032\b\022\004\022\0020\b0\007¢\006\b\n\000\032\004\b\017\020\020¨\006$"}, d2 = {"Lai/grazie/model/task/library/webSearch/WebSearchTaskResult;", "", "seen1", "", "answer", "", "results", "", "Lai/grazie/model/task/library/webSearch/WebSearchTaskResult$Result;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/util/List;)V", "getAnswer", "()Ljava/lang/String;", "getResults", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$model_task", "$serializer", "Companion", "Result", "model-task"})
/*    */ public final class WebSearchTaskResult {
/*    */   @NotNull
/*  6 */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final String answer; @NotNull
/*  9 */   private final List<Result> results; public WebSearchTaskResult(@NotNull String answer, @NotNull List<Result> results) { this.answer = answer;
/* 10 */     this.results = results; } @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; static { KSerializer[] arrayOfKSerializer = new KSerializer[2]; arrayOfKSerializer[0] = null; arrayOfKSerializer[1] = (KSerializer)new ArrayListSerializer((KSerializer)Result.$serializer.INSTANCE); $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; } @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/model/task/library/webSearch/WebSearchTaskResult.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/model/task/library/webSearch/WebSearchTaskResult;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-task"}) public static final class $serializer implements GeneratedSerializer<WebSearchTaskResult> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer1 = (KSerializer[])WebSearchTaskResult.$childSerializers, arrayOfKSerializer2 = new KSerializer[2]; arrayOfKSerializer2[0] = (KSerializer)StringSerializer.INSTANCE; arrayOfKSerializer2[1] = arrayOfKSerializer1[1]; return (KSerializer<?>[])arrayOfKSerializer2; } @NotNull public WebSearchTaskResult deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; String str = null; List list = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); KSerializer[] arrayOfKSerializer = (KSerializer[])WebSearchTaskResult.$childSerializers; if (compositeDecoder.decodeSequentially()) { str = compositeDecoder.decodeStringElement(serialDescriptor, 0); i |= 0x1; list = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)arrayOfKSerializer[1], list); i |= 0x2; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: str = compositeDecoder.decodeStringElement(serialDescriptor, 0); i |= 0x1; continue;case 1: list = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)arrayOfKSerializer[1], list); i |= 0x2; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new WebSearchTaskResult(i, str, list, null); } public void serialize(@NotNull Encoder encoder, @NotNull WebSearchTaskResult value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); WebSearchTaskResult.write$Self$model_task(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.model.task.library.webSearch.WebSearchTaskResult", INSTANCE, 2); pluginGeneratedSerialDescriptor.addElement("answer", false); pluginGeneratedSerialDescriptor.addElement("results", false); descriptor = pluginGeneratedSerialDescriptor; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/model/task/library/webSearch/WebSearchTaskResult$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/model/task/library/webSearch/WebSearchTaskResult;", "model-task"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<WebSearchTaskResult> serializer() { return (KSerializer<WebSearchTaskResult>)WebSearchTaskResult.$serializer.INSTANCE; } } @NotNull public final String getAnswer() { return this.answer; } @NotNull public final List<Result> getResults() { return this.results; } @NotNull public final String component1() { return this.answer; } @NotNull public final List<Result> component2() { return this.results; } @NotNull public final WebSearchTaskResult copy(@NotNull String answer, @NotNull List<Result> results) { Intrinsics.checkNotNullParameter(answer, "answer"); Intrinsics.checkNotNullParameter(results, "results"); return new WebSearchTaskResult(answer, results); } @NotNull public String toString() { return "WebSearchTaskResult(answer=" + this.answer + ", results=" + this.results + ")"; }
/*    */   public int hashCode() { result = this.answer.hashCode(); return result * 31 + this.results.hashCode(); }
/*    */   public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof WebSearchTaskResult)) return false;  WebSearchTaskResult webSearchTaskResult = (WebSearchTaskResult)other; return !Intrinsics.areEqual(this.answer, webSearchTaskResult.answer) ? false : (!!Intrinsics.areEqual(this.results, webSearchTaskResult.results)); }
/*    */   @Serializable @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000>\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\002\b\004\n\002\030\002\n\002\b\r\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 %2\0020\001:\002$%BA\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\005\022\b\020\007\032\004\030\0010\005\022\b\020\b\032\004\030\0010\005\022\b\020\t\032\004\030\0010\n¢\006\002\020\013B'\022\006\020\004\032\0020\005\022\006\020\006\032\0020\005\022\006\020\007\032\0020\005\022\b\020\b\032\004\030\0010\005¢\006\002\020\fJ\t\020\022\032\0020\005HÆ\003J\t\020\023\032\0020\005HÆ\003J\t\020\024\032\0020\005HÆ\003J\013\020\025\032\004\030\0010\005HÆ\003J3\020\026\032\0020\0002\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0052\b\b\002\020\007\032\0020\0052\n\b\002\020\b\032\004\030\0010\005HÆ\001J\023\020\027\032\0020\0302\b\020\031\032\004\030\0010\001HÖ\003J\t\020\032\032\0020\003HÖ\001J\t\020\033\032\0020\005HÖ\001J&\020\034\032\0020\0352\006\020\036\032\0020\0002\006\020\037\032\0020 2\006\020!\032\0020\"HÁ\001¢\006\002\b#R\021\020\007\032\0020\005¢\006\b\n\000\032\004\b\r\020\016R\023\020\b\032\004\030\0010\005¢\006\b\n\000\032\004\b\017\020\016R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\020\020\016R\021\020\006\032\0020\005¢\006\b\n\000\032\004\b\021\020\016¨\006&"}, d2 = {"Lai/grazie/model/task/library/webSearch/WebSearchTaskResult$Result;", "", "seen1", "", "title", "", "url", "content", "publishedDate", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getContent", "()Ljava/lang/String;", "getPublishedDate", "getTitle", "getUrl", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$model_task", "$serializer", "Companion", "model-task"}) public static final class Result { @NotNull public static final Companion Companion = new Companion(null); @NotNull private final String title; @NotNull private final String url; @NotNull private final String content; @Nullable private final String publishedDate;
/* 14 */     public Result(@NotNull String title, @NotNull String url, @NotNull String content, @Nullable String publishedDate) { this.title = title;
/* 15 */       this.url = url;
/* 16 */       this.content = content;
/* 17 */       this.publishedDate = publishedDate; } @Nullable public final String getPublishedDate() { return this.publishedDate; }
/*    */ 
/*    */     
/*    */     @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/model/task/library/webSearch/WebSearchTaskResult.Result.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/model/task/library/webSearch/WebSearchTaskResult$Result;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-task"})
/*    */     public static final class $serializer implements GeneratedSerializer<Result> {
/*    */       @NotNull
/*    */       public static final $serializer INSTANCE = new $serializer();
/*    */       
/*    */       @NotNull
/*    */       public KSerializer<?>[] typeParametersSerializers() {
/*    */         return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
/*    */       }
/*    */       
/*    */       @NotNull
/*    */       public SerialDescriptor getDescriptor() {
/*    */         return (SerialDescriptor)descriptor;
/*    */       }
/*    */       
/*    */       @NotNull
/*    */       public KSerializer<?>[] childSerializers() {
/*    */         KSerializer[] arrayOfKSerializer = new KSerializer[4];
/*    */         arrayOfKSerializer[0] = (KSerializer)StringSerializer.INSTANCE;
/*    */         arrayOfKSerializer[1] = (KSerializer)StringSerializer.INSTANCE;
/*    */         arrayOfKSerializer[2] = (KSerializer)StringSerializer.INSTANCE;
/*    */         arrayOfKSerializer[3] = BuiltinSerializersKt.getNullable((KSerializer)StringSerializer.INSTANCE);
/*    */         return (KSerializer<?>[])arrayOfKSerializer;
/*    */       }
/*    */       
/*    */       @NotNull
/*    */       public WebSearchTaskResult.Result deserialize(@NotNull Decoder decoder) {
/*    */         Intrinsics.checkNotNullParameter(decoder, "decoder");
/*    */         SerialDescriptor serialDescriptor = getDescriptor();
/*    */         boolean bool = true;
/*    */         int i = 0;
/*    */         String str1 = null, str2 = null, str3 = null, str4 = null;
/*    */         CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*    */         if (compositeDecoder.decodeSequentially()) {
/*    */           str1 = compositeDecoder.decodeStringElement(serialDescriptor, 0);
/*    */           i |= 0x1;
/*    */           str2 = compositeDecoder.decodeStringElement(serialDescriptor, 1);
/*    */           i |= 0x2;
/*    */           str3 = compositeDecoder.decodeStringElement(serialDescriptor, 2);
/*    */           i |= 0x4;
/*    */           str4 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 3, (DeserializationStrategy)StringSerializer.INSTANCE, str4);
/*    */           i |= 0x8;
/*    */         } else {
/*    */           while (bool) {
/*    */             int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*    */             switch (j) {
/*    */               case -1:
/*    */                 bool = false;
/*    */                 continue;
/*    */               case 0:
/*    */                 str1 = compositeDecoder.decodeStringElement(serialDescriptor, 0);
/*    */                 i |= 0x1;
/*    */                 continue;
/*    */               case 1:
/*    */                 str2 = compositeDecoder.decodeStringElement(serialDescriptor, 1);
/*    */                 i |= 0x2;
/*    */                 continue;
/*    */               case 2:
/*    */                 str3 = compositeDecoder.decodeStringElement(serialDescriptor, 2);
/*    */                 i |= 0x4;
/*    */                 continue;
/*    */               case 3:
/*    */                 str4 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 3, (DeserializationStrategy)StringSerializer.INSTANCE, str4);
/*    */                 i |= 0x8;
/*    */                 continue;
/*    */             } 
/*    */             throw new UnknownFieldException(j);
/*    */           } 
/*    */         } 
/*    */         compositeDecoder.endStructure(serialDescriptor);
/*    */         return new WebSearchTaskResult.Result(i, str1, str2, str3, str4, null);
/*    */       }
/*    */       
/*    */       public void serialize(@NotNull Encoder encoder, @NotNull WebSearchTaskResult.Result value) {
/*    */         Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */         Intrinsics.checkNotNullParameter(value, "value");
/*    */         SerialDescriptor serialDescriptor = getDescriptor();
/*    */         CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*    */         WebSearchTaskResult.Result.write$Self$model_task(value, compositeEncoder, serialDescriptor);
/*    */         compositeEncoder.endStructure(serialDescriptor);
/*    */       }
/*    */       
/*    */       static {
/*    */         PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.model.task.library.webSearch.WebSearchTaskResult.Result", INSTANCE, 4);
/*    */         pluginGeneratedSerialDescriptor.addElement("title", false);
/*    */         pluginGeneratedSerialDescriptor.addElement("url", false);
/*    */         pluginGeneratedSerialDescriptor.addElement("content", false);
/*    */         pluginGeneratedSerialDescriptor.addElement("publishedDate", false);
/*    */         descriptor = pluginGeneratedSerialDescriptor;
/*    */       }
/*    */     }
/*    */     
/*    */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/model/task/library/webSearch/WebSearchTaskResult$Result$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/model/task/library/webSearch/WebSearchTaskResult$Result;", "model-task"})
/*    */     public static final class Companion {
/*    */       private Companion() {}
/*    */       
/*    */       @NotNull
/*    */       public final KSerializer<WebSearchTaskResult.Result> serializer() {
/*    */         return (KSerializer<WebSearchTaskResult.Result>)WebSearchTaskResult.Result.$serializer.INSTANCE;
/*    */       }
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final String getTitle() {
/*    */       return this.title;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final String getUrl() {
/*    */       return this.url;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final String getContent() {
/*    */       return this.content;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final String component1() {
/*    */       return this.title;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final String component2() {
/*    */       return this.url;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final String component3() {
/*    */       return this.content;
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final String component4() {
/*    */       return this.publishedDate;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final Result copy(@NotNull String title, @NotNull String url, @NotNull String content, @Nullable String publishedDate) {
/*    */       Intrinsics.checkNotNullParameter(title, "title");
/*    */       Intrinsics.checkNotNullParameter(url, "url");
/*    */       Intrinsics.checkNotNullParameter(content, "content");
/*    */       return new Result(title, url, content, publishedDate);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public String toString() {
/*    */       return "Result(title=" + this.title + ", url=" + this.url + ", content=" + this.content + ", publishedDate=" + this.publishedDate + ")";
/*    */     }
/*    */     
/*    */     public int hashCode() {
/*    */       result = this.title.hashCode();
/*    */       result = result * 31 + this.url.hashCode();
/*    */       result = result * 31 + this.content.hashCode();
/*    */       return result * 31 + ((this.publishedDate == null) ? 0 : this.publishedDate.hashCode());
/*    */     }
/*    */     
/*    */     public boolean equals(@Nullable Object other) {
/*    */       if (this == other)
/*    */         return true; 
/*    */       if (!(other instanceof Result))
/*    */         return false; 
/*    */       Result result = (Result)other;
/*    */       return !Intrinsics.areEqual(this.title, result.title) ? false : (!Intrinsics.areEqual(this.url, result.url) ? false : (!Intrinsics.areEqual(this.content, result.content) ? false : (!!Intrinsics.areEqual(this.publishedDate, result.publishedDate))));
/*    */     } }
/*    */ 
/*    */   
/*    */   @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/model/task/library/webSearch/WebSearchTaskResult.Result.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/model/task/library/webSearch/WebSearchTaskResult$Result;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-task"})
/*    */   public static final class $serializer implements GeneratedSerializer<Result> {
/*    */     @NotNull
/*    */     public static final $serializer INSTANCE = new $serializer();
/*    */     
/*    */     @NotNull
/*    */     public KSerializer<?>[] typeParametersSerializers() {
/*    */       return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public SerialDescriptor getDescriptor() {
/*    */       return (SerialDescriptor)descriptor;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public KSerializer<?>[] childSerializers() {
/*    */       KSerializer[] arrayOfKSerializer = new KSerializer[4];
/*    */       arrayOfKSerializer[0] = (KSerializer)StringSerializer.INSTANCE;
/*    */       arrayOfKSerializer[1] = (KSerializer)StringSerializer.INSTANCE;
/*    */       arrayOfKSerializer[2] = (KSerializer)StringSerializer.INSTANCE;
/*    */       arrayOfKSerializer[3] = BuiltinSerializersKt.getNullable((KSerializer)StringSerializer.INSTANCE);
/*    */       return (KSerializer<?>[])arrayOfKSerializer;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public WebSearchTaskResult.Result deserialize(@NotNull Decoder decoder) {
/*    */       Intrinsics.checkNotNullParameter(decoder, "decoder");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       boolean bool = true;
/*    */       int i = 0;
/*    */       String str1 = null, str2 = null, str3 = null, str4 = null;
/*    */       CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*    */       if (compositeDecoder.decodeSequentially()) {
/*    */         str1 = compositeDecoder.decodeStringElement(serialDescriptor, 0);
/*    */         i |= 0x1;
/*    */         str2 = compositeDecoder.decodeStringElement(serialDescriptor, 1);
/*    */         i |= 0x2;
/*    */         str3 = compositeDecoder.decodeStringElement(serialDescriptor, 2);
/*    */         i |= 0x4;
/*    */         str4 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 3, (DeserializationStrategy)StringSerializer.INSTANCE, str4);
/*    */         i |= 0x8;
/*    */       } else {
/*    */         while (bool) {
/*    */           int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*    */           switch (j) {
/*    */             case -1:
/*    */               bool = false;
/*    */               continue;
/*    */             case 0:
/*    */               str1 = compositeDecoder.decodeStringElement(serialDescriptor, 0);
/*    */               i |= 0x1;
/*    */               continue;
/*    */             case 1:
/*    */               str2 = compositeDecoder.decodeStringElement(serialDescriptor, 1);
/*    */               i |= 0x2;
/*    */               continue;
/*    */             case 2:
/*    */               str3 = compositeDecoder.decodeStringElement(serialDescriptor, 2);
/*    */               i |= 0x4;
/*    */               continue;
/*    */             case 3:
/*    */               str4 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 3, (DeserializationStrategy)StringSerializer.INSTANCE, str4);
/*    */               i |= 0x8;
/*    */               continue;
/*    */           } 
/*    */           throw new UnknownFieldException(j);
/*    */         } 
/*    */       } 
/*    */       compositeDecoder.endStructure(serialDescriptor);
/*    */       return new WebSearchTaskResult.Result(i, str1, str2, str3, str4, null);
/*    */     }
/*    */     
/*    */     public void serialize(@NotNull Encoder encoder, @NotNull WebSearchTaskResult.Result value) {
/*    */       Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */       Intrinsics.checkNotNullParameter(value, "value");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*    */       WebSearchTaskResult.Result.write$Self$model_task(value, compositeEncoder, serialDescriptor);
/*    */       compositeEncoder.endStructure(serialDescriptor);
/*    */     }
/*    */     
/*    */     static {
/*    */       PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.model.task.library.webSearch.WebSearchTaskResult.Result", INSTANCE, 4);
/*    */       pluginGeneratedSerialDescriptor.addElement("title", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("url", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("content", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("publishedDate", false);
/*    */       descriptor = pluginGeneratedSerialDescriptor;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\library\webSearch\WebSearchTaskResult.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */