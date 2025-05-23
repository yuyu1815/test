/*     */ package ai.grazie.api.gateway.client.api.llm;
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\001\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\005\n\002\020 \n\002\030\002\n\002\b\005\n\002\020!\n\002\030\002\n\000\n\002\020\t\n\002\b\006\n\002\030\002\n\002\b\t\n\002\020\016\n\002\b\005\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\b\n\002\030\002\n\002\b\013\n\002\020\006\n\002\b\f\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\020\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\030\0002\0020\001B\005¢\006\002\020\002J\b\020R\032\0020SH\007J\b\020T\032\0020UH\007J\006\020V\032\0020WJ\037\020\t\032\0020X2\027\020\t\032\023\022\004\022\0020Z\022\004\022\0020X0Y¢\006\002\b[J+\020\032\032\0020X2\n\b\002\020\\\032\004\030\0010%2\027\020\032\032\023\022\004\022\0020]\022\004\022\0020X0Y¢\006\002\b[J\n\020^\032\0020X*\0020ZJ\n\020^\032\0020X*\0020]R\034\020\003\032\004\030\0010\004X\016¢\006\016\n\000\032\004\b\005\020\006\"\004\b\007\020\bR\"\020\t\032\n\022\004\022\0020\013\030\0010\nX\016¢\006\016\n\000\032\004\b\f\020\r\"\004\b\016\020\017R\024\020\020\032\b\022\004\022\0020\0220\021X\004¢\006\002\n\000R\036\020\023\032\004\030\0010\024X\016¢\006\020\n\002\020\031\032\004\b\025\020\026\"\004\b\027\020\030R\034\020\032\032\004\030\0010\033X\016¢\006\016\n\000\032\004\b\034\020\035\"\004\b\036\020\037R\024\020 \032\b\022\004\022\0020\0220\021X\004¢\006\002\n\000R\036\020!\032\004\030\0010\024X\016¢\006\020\n\002\020\031\032\004\b\"\020\026\"\004\b#\020\030R\034\020$\032\004\030\0010%X\016¢\006\016\n\000\032\004\b&\020'\"\004\b(\020)R\034\020*\032\004\030\0010+X\016¢\006\016\n\000\032\004\b,\020-\"\004\b.\020/R\034\0200\032\004\030\00101X\016¢\006\016\n\000\032\004\b2\0203\"\004\b4\0205R\034\0206\032\004\030\0010%X\016¢\006\016\n\000\032\004\b7\020'\"\004\b8\020)R\034\0209\032\004\030\0010:X\016¢\006\016\n\000\032\004\b;\020<\"\004\b=\020>R\036\020?\032\004\030\0010\024X\016¢\006\020\n\002\020\031\032\004\b@\020\026\"\004\bA\020\030R\034\020B\032\004\030\0010%X\016¢\006\016\n\000\032\004\bC\020'\"\004\bD\020)R\036\020E\032\004\030\0010FX\016¢\006\020\n\002\020K\032\004\bG\020H\"\004\bI\020JR\036\020L\032\004\030\0010\024X\016¢\006\020\n\002\020\031\032\004\bM\020\026\"\004\bN\020\030R\036\020O\032\004\030\0010FX\016¢\006\020\n\002\020K\032\004\bP\020H\"\004\bQ\020J¨\006_"}, d2 = {"Lai/grazie/api/gateway/client/api/llm/ChatRequestBuilder;", "", "()V", "functionCall", "Lai/grazie/model/llm/chat/function/LLMFunctionCall;", "getFunctionCall", "()Lai/grazie/model/llm/chat/function/LLMFunctionCall;", "setFunctionCall", "(Lai/grazie/model/llm/chat/function/LLMFunctionCall;)V", "functions", "", "Lai/grazie/model/llm/chat/function/LLMFunction;", "getFunctions", "()Ljava/util/List;", "setFunctions", "(Ljava/util/List;)V", "functionsCachingPoints", "", "Lai/grazie/model/llm/chat/caching/LLMCachePoint;", "length", "", "getLength", "()Ljava/lang/Long;", "setLength", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "messages", "Lai/grazie/model/llm/chat/v5/LLMChat;", "getMessages", "()Lai/grazie/model/llm/chat/v5/LLMChat;", "setMessages", "(Lai/grazie/model/llm/chat/v5/LLMChat;)V", "messagesCachingPoints", "numberOfChoices", "getNumberOfChoices", "setNumberOfChoices", "predictedOutput", "", "getPredictedOutput", "()Ljava/lang/String;", "setPredictedOutput", "(Ljava/lang/String;)V", "profile", "Lai/grazie/model/llm/profile/LLMProfileID;", "getProfile", "()Lai/grazie/model/llm/profile/LLMProfileID;", "setProfile", "(Lai/grazie/model/llm/profile/LLMProfileID;)V", "prompt", "Lai/grazie/model/llm/prompt/LLMPromptID;", "getPrompt", "()Lai/grazie/model/llm/prompt/LLMPromptID;", "setPrompt", "(Lai/grazie/model/llm/prompt/LLMPromptID;)V", "reasoningEffort", "getReasoningEffort", "setReasoningEffort", "responseFormat", "Lai/grazie/model/llm/chat/response/LLMResponseFormat;", "getResponseFormat", "()Lai/grazie/model/llm/chat/response/LLMResponseFormat;", "setResponseFormat", "(Lai/grazie/model/llm/chat/response/LLMResponseFormat;)V", "seed", "getSeed", "setSeed", "stopToken", "getStopToken", "setStopToken", "temperature", "", "getTemperature", "()Ljava/lang/Double;", "setTemperature", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "topK", "getTopK", "setTopK", "topP", "getTopP", "setTopP", "build", "Lai/grazie/api/gateway/api/llm/LlmAPI$Chat$Stream$V5$Request;", "buildV6", "Lai/grazie/api/gateway/api/llm/LlmAPI$Chat$Stream$V6$Request;", "buildV7", "Lai/grazie/api/gateway/api/llm/LlmAPI$Chat$Stream$V7$Request;", "", "Lkotlin/Function1;", "Lai/grazie/model/llm/chat/function/LLMFunctionsBuilder;", "Lkotlin/ExtensionFunctionType;", "instruction", "Lai/grazie/model/llm/chat/v5/LLMChat$Builder;", "addCachePoint", "api-gateway-client"})
/*     */ @SourceDebugExtension({"SMAP\nChatRequestBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChatRequestBuilder.kt\nai/grazie/api/gateway/client/api/llm/ChatRequestBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ControlFlow.kt\nai/grazie/utils/ControlFlowKt\n+ 4 JSON.kt\nai/grazie/utils/json/JSON\n*L\n1#1,186:1\n1#2:187\n12#3,4:188\n12#3,2:192\n15#3:195\n12#3,2:196\n15#3:199\n12#3,4:200\n12#3,4:204\n12#3,4:208\n12#3,4:212\n12#3,4:216\n12#3,4:220\n12#3,4:224\n12#3,4:228\n12#3,4:232\n12#3,2:236\n15#3:239\n12#3,2:240\n15#3:243\n12#3,4:244\n12#3,4:248\n12#3,4:252\n12#3,4:256\n12#3,4:260\n12#3,4:264\n12#3,4:268\n12#3,4:272\n12#3,4:276\n12#3,2:280\n15#3:283\n12#3,2:284\n15#3:287\n12#3,2:288\n15#3:291\n12#3,4:292\n12#3,4:296\n12#3,4:300\n12#3,4:304\n12#3,4:308\n12#3,4:312\n12#3,4:316\n12#3,4:320\n4#3,2:324\n7#3:327\n28#4:194\n28#4:198\n28#4:238\n28#4:242\n28#4:282\n28#4:286\n28#4:290\n28#4:326\n*S KotlinDebug\n*F\n+ 1 ChatRequestBuilder.kt\nai/grazie/api/gateway/client/api/llm/ChatRequestBuilder\n*L\n127#1:188,4\n128#1:192,2\n128#1:195\n129#1:196,2\n129#1:199\n130#1:200,4\n131#1:204,4\n132#1:208,4\n133#1:212,4\n134#1:216,4\n135#1:220,4\n136#1:224,4\n137#1:228,4\n148#1:232,4\n149#1:236,2\n149#1:239\n150#1:240,2\n150#1:243\n151#1:244,4\n152#1:248,4\n153#1:252,4\n154#1:256,4\n155#1:260,4\n156#1:264,4\n157#1:268,4\n158#1:272,4\n168#1:276,4\n169#1:280,2\n169#1:283\n170#1:284,2\n170#1:287\n171#1:288,2\n171#1:291\n172#1:292,4\n173#1:296,4\n174#1:300,4\n175#1:304,4\n176#1:308,4\n177#1:312,4\n178#1:316,4\n179#1:320,4\n180#1:324,2\n180#1:327\n128#1:194\n129#1:198\n149#1:238\n150#1:242\n169#1:282\n170#1:286\n171#1:290\n181#1:326\n*E\n"})
/*     */ public final class ChatRequestBuilder {
/*     */   @Nullable
/*     */   private LLMPromptID prompt;
/*     */   @Nullable
/*     */   private LLMChat messages;
/*     */   @Nullable
/*     */   private LLMProfileID profile;
/*     */   @Nullable
/*     */   private Double temperature;
/*     */   @Nullable
/*     */   private List<LLMFunction> functions;
/*     */   @Nullable
/*     */   private LLMFunctionCall functionCall;
/*     */   @Nullable
/*     */   private LLMResponseFormat responseFormat;
/*     */   
/*     */   @Nullable
/*  21 */   public final LLMPromptID getPrompt() { return this.prompt; } @Nullable private Long numberOfChoices; @Nullable private String stopToken; @Nullable private Long length; @Nullable private Long seed; @Nullable private Double topP; @Nullable private Long topK; @Nullable private String predictedOutput; @Nullable private String reasoningEffort; public final void setPrompt(@Nullable LLMPromptID <set-?>) { this.prompt = <set-?>; }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public final LLMChat getMessages() {
/*  26 */     return this.messages; } public final void setMessages(@Nullable LLMChat <set-?>) { this.messages = <set-?>; }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public final LLMProfileID getProfile() {
/*  31 */     return this.profile; } public final void setProfile(@Nullable LLMProfileID <set-?>) { this.profile = <set-?>; }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public final Double getTemperature() {
/*  36 */     return this.temperature; } public final void setTemperature(@Nullable Double <set-?>) { this.temperature = <set-?>; }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public final List<LLMFunction> getFunctions()
/*     */   {
/*  42 */     return this.functions; } public final void setFunctions(@Nullable List<LLMFunction> <set-?>) { this.functions = <set-?>; }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public final LLMFunctionCall getFunctionCall()
/*     */   {
/*  48 */     return this.functionCall; } public final void setFunctionCall(@Nullable LLMFunctionCall <set-?>) { this.functionCall = <set-?>; }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public final LLMResponseFormat getResponseFormat()
/*     */   {
/*  54 */     return this.responseFormat; } public final void setResponseFormat(@Nullable LLMResponseFormat <set-?>) { this.responseFormat = <set-?>; }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public final Long getNumberOfChoices() {
/*  59 */     return this.numberOfChoices; } public final void setNumberOfChoices(@Nullable Long <set-?>) { this.numberOfChoices = <set-?>; }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public final String getStopToken() {
/*  64 */     return this.stopToken; } public final void setStopToken(@Nullable String <set-?>) { this.stopToken = <set-?>; }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public final Long getLength() {
/*  69 */     return this.length; } public final void setLength(@Nullable Long <set-?>) { this.length = <set-?>; }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public final Long getSeed() {
/*  74 */     return this.seed; } public final void setSeed(@Nullable Long <set-?>) { this.seed = <set-?>; }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public final Double getTopP() {
/*  79 */     return this.topP; } public final void setTopP(@Nullable Double <set-?>) { this.topP = <set-?>; }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public final Long getTopK() {
/*  84 */     return this.topK; } public final void setTopK(@Nullable Long <set-?>) { this.topK = <set-?>; }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public final String getPredictedOutput() {
/*  89 */     return this.predictedOutput; } public final void setPredictedOutput(@Nullable String <set-?>) { this.predictedOutput = <set-?>; }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public final String getReasoningEffort() {
/*  94 */     return this.reasoningEffort; } public final void setReasoningEffort(@Nullable String <set-?>) { this.reasoningEffort = <set-?>; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/* 101 */   private final List<LLMCachePoint> functionsCachingPoints = new ArrayList<>(); @NotNull
/* 102 */   private final List<LLMCachePoint> messagesCachingPoints = new ArrayList<>();
/*     */   
/*     */   public final void messages(@Nullable String instruction, @NotNull Function1 messages) {
/* 105 */     Intrinsics.checkNotNullParameter(messages, "messages"); LLMChat.Builder builder = new LLMChat.Builder(instruction); messages.invoke(builder); this.messages = builder.build();
/*     */   }
/*     */   
/*     */   public final void functions(@NotNull Function1 functions) {
/* 109 */     Intrinsics.checkNotNullParameter(functions, "functions"); LLMFunctionsBuilder lLMFunctionsBuilder = new LLMFunctionsBuilder(); functions.invoke(lLMFunctionsBuilder); this.functions = lLMFunctionsBuilder.build();
/*     */   }
/*     */   
/*     */   public final void addCachePoint(@NotNull LLMChat.Builder $this$addCachePoint) {
/* 113 */     Intrinsics.checkNotNullParameter($this$addCachePoint, "<this>"); this.messagesCachingPoints.add($this$addCachePoint.getCachingPoint());
/*     */   }
/*     */   
/*     */   public final void addCachePoint(@NotNull LLMFunctionsBuilder $this$addCachePoint) {
/* 117 */     Intrinsics.checkNotNullParameter($this$addCachePoint, "<this>"); this.functionsCachingPoints.add($this$addCachePoint.getCachingPoint());
/*     */   }
/*     */   
/*     */   @Deprecated(message = "use v7 instead", replaceWith = @ReplaceWith(expression = "buildV7()", imports = {}))
/*     */   @NotNull
/*     */   public final LlmAPI.Chat.Stream.V5.Request build() { LLMProfileID lLMProfileID;
/* 123 */     if (this.prompt == null)
/*     */     
/*     */     { 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 187 */       int $i$a$-requireNotNull-ChatRequestBuilder$build$1 = 0; String str = "prompt is required"; throw new IllegalArgumentException(str.toString()); }  if (this.profile == null) { LLMProfileID lLMProfileID1 = this.profile; int $i$a$-requireNotNull-ChatRequestBuilder$build$2 = 0; String str = "profile is required"; throw new IllegalArgumentException(str.toString()); }  if (this.messages == null) { LLMProfileID lLMProfileID1; LLMChat lLMChat = this.messages; int $i$a$-requireNotNull-ChatRequestBuilder$build$3 = 0; String str2 = "messages is required", str1 = str2; throw new IllegalArgumentException(str1.toString()); }
/* 188 */      Attributes attributes = new Attributes(); Object<LLMFunction> object = (Object<LLMFunction>)this.temperature; int $i$f$chainIfNotNull = 0; if (object != null) {
/* 189 */       LLMProfileID lLMProfileID1; double d = ((Number)object).doubleValue(); Attributes attributes1 = attributes; LLMChat lLMChat4 = this.messages, lLMChat3 = lLMChat4; int $i$a$-chainIfNotNull-ChatRequestBuilder$build$4 = 0; Attributes attributes2 = attributes1.put((Attributes.Key)LLMParameters.INSTANCE.getTemperature(), (Attributes.Value)new Attributes.Value.Double(d, null, 2, null));
/*     */     } 
/* 191 */     Object $this$chainIfNotNull$iv = attributes; object = (Object<LLMFunction>)this.functions; $i$f$chainIfNotNull = 0;
/* 192 */     if (object != null) {
/* 193 */       LLMProfileID lLMProfileID1; Object<LLMFunction> object2 = object; Object object3 = $this$chainIfNotNull$iv; LLMChat lLMChat4 = this.messages, lLMChat3 = lLMChat4; int $i$a$-chainIfNotNull-ChatRequestBuilder$build$5 = 0; JSON this_$iv = (JSON)JSON.Default.INSTANCE; int $i$f$string = 0;
/*     */     } 
/* 195 */     $this$chainIfNotNull$iv = $this$chainIfNotNull$iv; Object value$iv = this.functionCall; $i$f$chainIfNotNull = 0;
/* 196 */     if (value$iv != null) {
/* 197 */       LLMProfileID lLMProfileID1; Object object2 = value$iv, object3 = $this$chainIfNotNull$iv; LLMChat lLMChat4 = this.messages, lLMChat3 = lLMChat4; int $i$a$-chainIfNotNull-ChatRequestBuilder$build$6 = 0; JSON this_$iv = (JSON)JSON.Default.INSTANCE; int $i$f$string = 0;
/*     */     } 
/* 199 */     $this$chainIfNotNull$iv = $this$chainIfNotNull$iv; value$iv = this.numberOfChoices; $i$f$chainIfNotNull = 0;
/* 200 */     if (value$iv != null) {
/* 201 */       LLMProfileID lLMProfileID1; long l = ((Number)value$iv).longValue(); Object object2 = $this$chainIfNotNull$iv; LLMChat lLMChat4 = this.messages, lLMChat3 = lLMChat4; int $i$a$-chainIfNotNull-ChatRequestBuilder$build$7 = 0; Attributes attributes1 = object2.put((Attributes.Key)LLMParameters.INSTANCE.getNumberOfChoices(), (Attributes.Value)new Attributes.Value.Long(l, null, 2, null));
/*     */     } 
/* 203 */     $this$chainIfNotNull$iv = $this$chainIfNotNull$iv; value$iv = this.stopToken; $i$f$chainIfNotNull = 0;
/* 204 */     if (value$iv != null) {
/* 205 */       LLMProfileID lLMProfileID1; Object object2 = value$iv, object3 = $this$chainIfNotNull$iv; LLMChat lLMChat4 = this.messages, lLMChat3 = lLMChat4; int $i$a$-chainIfNotNull-ChatRequestBuilder$build$8 = 0; Attributes attributes1 = object3.put((Attributes.Key)LLMParameters.INSTANCE.getStopToken(), (Attributes.Value)new Attributes.Value.Text((String)object2, null, 2, null));
/*     */     } 
/* 207 */     $this$chainIfNotNull$iv = $this$chainIfNotNull$iv; value$iv = this.length; $i$f$chainIfNotNull = 0;
/* 208 */     if (value$iv != null) {
/* 209 */       LLMProfileID lLMProfileID1; long l = ((Number)value$iv).longValue(); Object object2 = $this$chainIfNotNull$iv; LLMChat lLMChat4 = this.messages, lLMChat3 = lLMChat4; int $i$a$-chainIfNotNull-ChatRequestBuilder$build$9 = 0; Attributes attributes1 = object2.put((Attributes.Key)LLMParameters.INSTANCE.getLength(), (Attributes.Value)new Attributes.Value.Long(l, null, 2, null));
/*     */     } 
/* 211 */     $this$chainIfNotNull$iv = $this$chainIfNotNull$iv; value$iv = this.seed; $i$f$chainIfNotNull = 0;
/* 212 */     if (value$iv != null) {
/* 213 */       LLMProfileID lLMProfileID1; long it = ((Number)value$iv).longValue(); Object object2 = $this$chainIfNotNull$iv; LLMChat lLMChat4 = this.messages, lLMChat3 = lLMChat4; int $i$a$-chainIfNotNull-ChatRequestBuilder$build$10 = 0; Attributes attributes1 = object2.put((Attributes.Key)LLMParameters.INSTANCE.getSeed(), (Attributes.Value)new Attributes.Value.Long(it, null, 2, null));
/*     */     } 
/* 215 */     $this$chainIfNotNull$iv = $this$chainIfNotNull$iv; value$iv = this.topP; $i$f$chainIfNotNull = 0;
/* 216 */     if (value$iv != null) {
/* 217 */       LLMProfileID lLMProfileID1; double d = ((Number)value$iv).doubleValue(); Object object2 = $this$chainIfNotNull$iv; LLMChat lLMChat4 = this.messages, lLMChat3 = lLMChat4; int $i$a$-chainIfNotNull-ChatRequestBuilder$build$11 = 0; Attributes attributes1 = object2.put((Attributes.Key)LLMParameters.INSTANCE.getTopP(), (Attributes.Value)new Attributes.Value.Double(d, null, 2, null));
/*     */     } 
/* 219 */     $this$chainIfNotNull$iv = $this$chainIfNotNull$iv; value$iv = this.topK; $i$f$chainIfNotNull = 0;
/* 220 */     if (value$iv != null) {
/* 221 */       LLMProfileID lLMProfileID1; long l = ((Number)value$iv).longValue(); Object object2 = $this$chainIfNotNull$iv; LLMChat lLMChat4 = this.messages, lLMChat3 = lLMChat4; int $i$a$-chainIfNotNull-ChatRequestBuilder$build$12 = 0; Attributes attributes1 = object2.put((Attributes.Key)LLMParameters.INSTANCE.getTopK(), (Attributes.Value)new Attributes.Value.Long(l, null, 2, null));
/*     */     } 
/* 223 */     $this$chainIfNotNull$iv = $this$chainIfNotNull$iv; value$iv = this.predictedOutput; $i$f$chainIfNotNull = 0;
/* 224 */     if (value$iv != null) {
/* 225 */       LLMProfileID lLMProfileID1; Object object2 = value$iv, object3 = $this$chainIfNotNull$iv; LLMChat lLMChat4 = this.messages, lLMChat3 = lLMChat4; int $i$a$-chainIfNotNull-ChatRequestBuilder$build$13 = 0; Attributes attributes1 = object3.put((Attributes.Key)LLMParameters.INSTANCE.getPredictedOutput(), (Attributes.Value)new Attributes.Value.Text((String)object2, null, 2, null));
/*     */     } 
/* 227 */     $this$chainIfNotNull$iv = $this$chainIfNotNull$iv; value$iv = this.reasoningEffort; $i$f$chainIfNotNull = 0;
/* 228 */     if (value$iv != null) {
/* 229 */       LLMProfileID lLMProfileID1; Object object2 = value$iv, object3 = $this$chainIfNotNull$iv; LLMChat lLMChat4 = this.messages, lLMChat3 = lLMChat4; int $i$a$-chainIfNotNull-ChatRequestBuilder$build$14 = 0; Attributes attributes1 = object3.put((Attributes.Key)LLMParameters.INSTANCE.getReasoningEffort(), (Attributes.Value)new Attributes.Value.Text((String)object2, null, 2, null));
/*     */     } 
/* 231 */     Object object1 = $this$chainIfNotNull$iv; LLMChat lLMChat1 = this.messages, lLMChat2 = lLMChat1; return new LlmAPI.Chat.Stream.V5.Request((LLMPromptID)lLMProfileID, (LLMProfileID)lLMChat2, lLMChat1, (Attributes)object1); } @Deprecated(message = "use v7 instead", replaceWith = @ReplaceWith(expression = "buildV7()", imports = {})) @NotNull public final LlmAPI.Chat.Stream.V6.Request buildV6() { LLMProfileID lLMProfileID; if (this.prompt == null) { int $i$a$-requireNotNull-ChatRequestBuilder$buildV6$1 = 0; String str = "prompt is required"; throw new IllegalArgumentException(str.toString()); }  if (this.profile == null) { LLMProfileID lLMProfileID1 = this.profile; int $i$a$-requireNotNull-ChatRequestBuilder$buildV6$2 = 0; String str = "profile is required"; throw new IllegalArgumentException(str.toString()); }  if (this.messages == null) { LLMProfileID lLMProfileID1; LLMChat lLMChat = this.messages; int $i$a$-requireNotNull-ChatRequestBuilder$buildV6$3 = 0; String str2 = "messages is required", str1 = str2; throw new IllegalArgumentException(str1.toString()); }
/* 232 */      Attributes attributes = new Attributes(); Object<LLMFunction> object = (Object<LLMFunction>)this.temperature; int $i$f$chainIfNotNull = 0; if (object != null) {
/* 233 */       LLMProfileID lLMProfileID1; double d = ((Number)object).doubleValue(); Attributes attributes1 = attributes; LLMChat lLMChat4 = this.messages, lLMChat3 = lLMChat4; int $i$a$-chainIfNotNull-ChatRequestBuilder$buildV6$4 = 0; Attributes attributes2 = attributes1.put((Attributes.Key)LLMParameters.INSTANCE.getTemperature(), (Attributes.Value)new Attributes.Value.Double(d, null, 2, null));
/*     */     } 
/* 235 */     Object $this$chainIfNotNull$iv = attributes; object = (Object<LLMFunction>)this.functions; $i$f$chainIfNotNull = 0;
/* 236 */     if (object != null) {
/* 237 */       LLMProfileID lLMProfileID1; Object<LLMFunction> object2 = object; Object object3 = $this$chainIfNotNull$iv; LLMChat lLMChat4 = this.messages, lLMChat3 = lLMChat4; int $i$a$-chainIfNotNull-ChatRequestBuilder$buildV6$5 = 0; JSON this_$iv = (JSON)JSON.Default.INSTANCE; int $i$f$string = 0;
/*     */     } 
/* 239 */     $this$chainIfNotNull$iv = $this$chainIfNotNull$iv; Object value$iv = this.functionCall; $i$f$chainIfNotNull = 0;
/* 240 */     if (value$iv != null) {
/* 241 */       LLMProfileID lLMProfileID1; Object object2 = value$iv, object3 = $this$chainIfNotNull$iv; LLMChat lLMChat4 = this.messages, lLMChat3 = lLMChat4; int $i$a$-chainIfNotNull-ChatRequestBuilder$buildV6$6 = 0; JSON this_$iv = (JSON)JSON.Default.INSTANCE; int $i$f$string = 0;
/*     */     } 
/* 243 */     $this$chainIfNotNull$iv = $this$chainIfNotNull$iv; value$iv = this.numberOfChoices; $i$f$chainIfNotNull = 0;
/* 244 */     if (value$iv != null) {
/* 245 */       LLMProfileID lLMProfileID1; long l = ((Number)value$iv).longValue(); Object object2 = $this$chainIfNotNull$iv; LLMChat lLMChat4 = this.messages, lLMChat3 = lLMChat4; int $i$a$-chainIfNotNull-ChatRequestBuilder$buildV6$7 = 0; Attributes attributes1 = object2.put((Attributes.Key)LLMParameters.INSTANCE.getNumberOfChoices(), (Attributes.Value)new Attributes.Value.Long(l, null, 2, null));
/*     */     } 
/* 247 */     $this$chainIfNotNull$iv = $this$chainIfNotNull$iv; value$iv = this.stopToken; $i$f$chainIfNotNull = 0;
/* 248 */     if (value$iv != null) {
/* 249 */       LLMProfileID lLMProfileID1; Object object2 = value$iv, object3 = $this$chainIfNotNull$iv; LLMChat lLMChat4 = this.messages, lLMChat3 = lLMChat4; int $i$a$-chainIfNotNull-ChatRequestBuilder$buildV6$8 = 0; Attributes attributes1 = object3.put((Attributes.Key)LLMParameters.INSTANCE.getStopToken(), (Attributes.Value)new Attributes.Value.Text((String)object2, null, 2, null));
/*     */     } 
/* 251 */     $this$chainIfNotNull$iv = $this$chainIfNotNull$iv; value$iv = this.length; $i$f$chainIfNotNull = 0;
/* 252 */     if (value$iv != null) {
/* 253 */       LLMProfileID lLMProfileID1; long l = ((Number)value$iv).longValue(); Object object2 = $this$chainIfNotNull$iv; LLMChat lLMChat4 = this.messages, lLMChat3 = lLMChat4; int $i$a$-chainIfNotNull-ChatRequestBuilder$buildV6$9 = 0; Attributes attributes1 = object2.put((Attributes.Key)LLMParameters.INSTANCE.getLength(), (Attributes.Value)new Attributes.Value.Long(l, null, 2, null));
/*     */     } 
/* 255 */     $this$chainIfNotNull$iv = $this$chainIfNotNull$iv; value$iv = this.seed; $i$f$chainIfNotNull = 0;
/* 256 */     if (value$iv != null) {
/* 257 */       LLMProfileID lLMProfileID1; long it = ((Number)value$iv).longValue(); Object object2 = $this$chainIfNotNull$iv; LLMChat lLMChat4 = this.messages, lLMChat3 = lLMChat4; int $i$a$-chainIfNotNull-ChatRequestBuilder$buildV6$10 = 0; Attributes attributes1 = object2.put((Attributes.Key)LLMParameters.INSTANCE.getSeed(), (Attributes.Value)new Attributes.Value.Long(it, null, 2, null));
/*     */     } 
/* 259 */     $this$chainIfNotNull$iv = $this$chainIfNotNull$iv; value$iv = this.topP; $i$f$chainIfNotNull = 0;
/* 260 */     if (value$iv != null) {
/* 261 */       LLMProfileID lLMProfileID1; double d = ((Number)value$iv).doubleValue(); Object object2 = $this$chainIfNotNull$iv; LLMChat lLMChat4 = this.messages, lLMChat3 = lLMChat4; int $i$a$-chainIfNotNull-ChatRequestBuilder$buildV6$11 = 0; Attributes attributes1 = object2.put((Attributes.Key)LLMParameters.INSTANCE.getTopP(), (Attributes.Value)new Attributes.Value.Double(d, null, 2, null));
/*     */     } 
/* 263 */     $this$chainIfNotNull$iv = $this$chainIfNotNull$iv; value$iv = this.topK; $i$f$chainIfNotNull = 0;
/* 264 */     if (value$iv != null) {
/* 265 */       LLMProfileID lLMProfileID1; long l = ((Number)value$iv).longValue(); Object object2 = $this$chainIfNotNull$iv; LLMChat lLMChat4 = this.messages, lLMChat3 = lLMChat4; int $i$a$-chainIfNotNull-ChatRequestBuilder$buildV6$12 = 0; Attributes attributes1 = object2.put((Attributes.Key)LLMParameters.INSTANCE.getTopK(), (Attributes.Value)new Attributes.Value.Long(l, null, 2, null));
/*     */     } 
/* 267 */     $this$chainIfNotNull$iv = $this$chainIfNotNull$iv; value$iv = this.predictedOutput; $i$f$chainIfNotNull = 0;
/* 268 */     if (value$iv != null) {
/* 269 */       LLMProfileID lLMProfileID1; Object object2 = value$iv, object3 = $this$chainIfNotNull$iv; LLMChat lLMChat4 = this.messages, lLMChat3 = lLMChat4; int $i$a$-chainIfNotNull-ChatRequestBuilder$buildV6$13 = 0; Attributes attributes1 = object3.put((Attributes.Key)LLMParameters.INSTANCE.getPredictedOutput(), (Attributes.Value)new Attributes.Value.Text((String)object2, null, 2, null));
/*     */     } 
/* 271 */     $this$chainIfNotNull$iv = $this$chainIfNotNull$iv; value$iv = this.reasoningEffort; $i$f$chainIfNotNull = 0;
/* 272 */     if (value$iv != null) {
/* 273 */       LLMProfileID lLMProfileID1; Object object2 = value$iv, object3 = $this$chainIfNotNull$iv; LLMChat lLMChat4 = this.messages, lLMChat3 = lLMChat4; int $i$a$-chainIfNotNull-ChatRequestBuilder$buildV6$14 = 0; Attributes attributes1 = object3.put((Attributes.Key)LLMParameters.INSTANCE.getReasoningEffort(), (Attributes.Value)new Attributes.Value.Text((String)object2, null, 2, null));
/*     */     } 
/* 275 */     Object object1 = $this$chainIfNotNull$iv; LLMChat lLMChat1 = this.messages, lLMChat2 = lLMChat1; return new LlmAPI.Chat.Stream.V6.Request((LLMPromptID)lLMProfileID, (LLMProfileID)lLMChat2, lLMChat1, (Attributes)object1); } @NotNull public final LlmAPI.Chat.Stream.V7.Request buildV7() { LLMProfileID lLMProfileID; if (this.prompt == null) { int $i$a$-requireNotNull-ChatRequestBuilder$buildV7$1 = 0; String str = "prompt is required"; throw new IllegalArgumentException(str.toString()); }  if (this.profile == null) { LLMProfileID lLMProfileID1 = this.profile; int $i$a$-requireNotNull-ChatRequestBuilder$buildV7$2 = 0; String str = "profile is required"; throw new IllegalArgumentException(str.toString()); }  if (this.messages == null) { LLMProfileID lLMProfileID1; LLMChat lLMChat = this.messages; int $i$a$-requireNotNull-ChatRequestBuilder$buildV7$3 = 0; String str2 = "messages is required", str1 = str2; throw new IllegalArgumentException(str1.toString()); }
/* 276 */      Attributes attributes = new Attributes(); Object<LLMFunction> object = (Object<LLMFunction>)this.temperature; int $i$f$chainIfNotNull = 0; if (object != null) {
/* 277 */       LLMProfileID lLMProfileID1; double d = ((Number)object).doubleValue(); Attributes attributes1 = attributes; LLMChat lLMChat4 = this.messages, lLMChat3 = lLMChat4; int $i$a$-chainIfNotNull-ChatRequestBuilder$buildV7$4 = 0; Attributes attributes2 = attributes1.put((Attributes.Key)LLMParameters.INSTANCE.getTemperature(), (Attributes.Value)new Attributes.Value.Double(d, null, 2, null));
/*     */     } 
/* 279 */     Object $this$chainIfNotNull$iv = attributes; object = (Object<LLMFunction>)this.functions; $i$f$chainIfNotNull = 0;
/* 280 */     if (object != null) {
/* 281 */       LLMProfileID lLMProfileID1; Object<LLMFunction> object2 = object; Object object3 = $this$chainIfNotNull$iv; LLMChat lLMChat4 = this.messages, lLMChat3 = lLMChat4; int $i$a$-chainIfNotNull-ChatRequestBuilder$buildV7$5 = 0; JSON this_$iv = (JSON)JSON.Default.INSTANCE; int $i$f$string = 0;
/*     */     } 
/* 283 */     $this$chainIfNotNull$iv = $this$chainIfNotNull$iv; Object value$iv = this.functionCall; $i$f$chainIfNotNull = 0;
/* 284 */     if (value$iv != null) {
/* 285 */       LLMProfileID lLMProfileID1; Object object2 = value$iv, object3 = $this$chainIfNotNull$iv; LLMChat lLMChat4 = this.messages, lLMChat3 = lLMChat4; int $i$a$-chainIfNotNull-ChatRequestBuilder$buildV7$6 = 0; JSON this_$iv = (JSON)JSON.Default.INSTANCE; int $i$f$string = 0;
/*     */     } 
/* 287 */     $this$chainIfNotNull$iv = $this$chainIfNotNull$iv; value$iv = this.responseFormat; $i$f$chainIfNotNull = 0;
/* 288 */     if (value$iv != null) {
/* 289 */       LLMProfileID lLMProfileID1; Object object2 = value$iv, object3 = $this$chainIfNotNull$iv; LLMChat lLMChat4 = this.messages, lLMChat3 = lLMChat4; int $i$a$-chainIfNotNull-ChatRequestBuilder$buildV7$7 = 0; JSON this_$iv = (JSON)JSON.Default.INSTANCE; int $i$f$string = 0;
/*     */     } 
/* 291 */     $this$chainIfNotNull$iv = $this$chainIfNotNull$iv; value$iv = this.numberOfChoices; $i$f$chainIfNotNull = 0;
/* 292 */     if (value$iv != null) {
/* 293 */       LLMProfileID lLMProfileID1; long l = ((Number)value$iv).longValue(); Object object2 = $this$chainIfNotNull$iv; LLMChat lLMChat4 = this.messages, lLMChat3 = lLMChat4; int $i$a$-chainIfNotNull-ChatRequestBuilder$buildV7$8 = 0; Attributes attributes1 = object2.put((Attributes.Key)LLMParameters.INSTANCE.getNumberOfChoices(), (Attributes.Value)new Attributes.Value.Long(l, null, 2, null));
/*     */     } 
/* 295 */     $this$chainIfNotNull$iv = $this$chainIfNotNull$iv; value$iv = this.stopToken; $i$f$chainIfNotNull = 0;
/* 296 */     if (value$iv != null) {
/* 297 */       LLMProfileID lLMProfileID1; Object object2 = value$iv, object3 = $this$chainIfNotNull$iv; LLMChat lLMChat4 = this.messages, lLMChat3 = lLMChat4; int $i$a$-chainIfNotNull-ChatRequestBuilder$buildV7$9 = 0; Attributes attributes1 = object3.put((Attributes.Key)LLMParameters.INSTANCE.getStopToken(), (Attributes.Value)new Attributes.Value.Text((String)object2, null, 2, null));
/*     */     } 
/* 299 */     $this$chainIfNotNull$iv = $this$chainIfNotNull$iv; value$iv = this.length; $i$f$chainIfNotNull = 0;
/* 300 */     if (value$iv != null) {
/* 301 */       LLMProfileID lLMProfileID1; long l = ((Number)value$iv).longValue(); Object object2 = $this$chainIfNotNull$iv; LLMChat lLMChat4 = this.messages, lLMChat3 = lLMChat4; int $i$a$-chainIfNotNull-ChatRequestBuilder$buildV7$10 = 0; Attributes attributes1 = object2.put((Attributes.Key)LLMParameters.INSTANCE.getLength(), (Attributes.Value)new Attributes.Value.Long(l, null, 2, null));
/*     */     } 
/* 303 */     $this$chainIfNotNull$iv = $this$chainIfNotNull$iv; value$iv = this.seed; $i$f$chainIfNotNull = 0;
/* 304 */     if (value$iv != null) {
/* 305 */       LLMProfileID lLMProfileID1; long it = ((Number)value$iv).longValue(); Object object2 = $this$chainIfNotNull$iv; LLMChat lLMChat4 = this.messages, lLMChat3 = lLMChat4; int $i$a$-chainIfNotNull-ChatRequestBuilder$buildV7$11 = 0; Attributes attributes1 = object2.put((Attributes.Key)LLMParameters.INSTANCE.getSeed(), (Attributes.Value)new Attributes.Value.Long(it, null, 2, null));
/*     */     } 
/* 307 */     $this$chainIfNotNull$iv = $this$chainIfNotNull$iv; value$iv = this.topP; $i$f$chainIfNotNull = 0;
/* 308 */     if (value$iv != null) {
/* 309 */       LLMProfileID lLMProfileID1; double d = ((Number)value$iv).doubleValue(); Object object2 = $this$chainIfNotNull$iv; LLMChat lLMChat4 = this.messages, lLMChat3 = lLMChat4; int $i$a$-chainIfNotNull-ChatRequestBuilder$buildV7$12 = 0; Attributes attributes1 = object2.put((Attributes.Key)LLMParameters.INSTANCE.getTopP(), (Attributes.Value)new Attributes.Value.Double(d, null, 2, null));
/*     */     } 
/* 311 */     $this$chainIfNotNull$iv = $this$chainIfNotNull$iv; value$iv = this.topK; $i$f$chainIfNotNull = 0;
/* 312 */     if (value$iv != null) {
/* 313 */       LLMProfileID lLMProfileID1; long l = ((Number)value$iv).longValue(); Object object2 = $this$chainIfNotNull$iv; LLMChat lLMChat4 = this.messages, lLMChat3 = lLMChat4; int $i$a$-chainIfNotNull-ChatRequestBuilder$buildV7$13 = 0; Attributes attributes1 = object2.put((Attributes.Key)LLMParameters.INSTANCE.getTopK(), (Attributes.Value)new Attributes.Value.Long(l, null, 2, null));
/*     */     } 
/* 315 */     $this$chainIfNotNull$iv = $this$chainIfNotNull$iv; value$iv = this.predictedOutput; $i$f$chainIfNotNull = 0;
/* 316 */     if (value$iv != null) {
/* 317 */       LLMProfileID lLMProfileID1; Object object2 = value$iv, object3 = $this$chainIfNotNull$iv; LLMChat lLMChat4 = this.messages, lLMChat3 = lLMChat4; int $i$a$-chainIfNotNull-ChatRequestBuilder$buildV7$14 = 0; Attributes attributes1 = object3.put((Attributes.Key)LLMParameters.INSTANCE.getPredictedOutput(), (Attributes.Value)new Attributes.Value.Text((String)object2, null, 2, null));
/*     */     } 
/* 319 */     $this$chainIfNotNull$iv = $this$chainIfNotNull$iv; value$iv = this.reasoningEffort; $i$f$chainIfNotNull = 0;
/* 320 */     if (value$iv != null) {
/* 321 */       LLMProfileID lLMProfileID1; Object object2 = value$iv, object3 = $this$chainIfNotNull$iv; LLMChat lLMChat4 = this.messages, lLMChat3 = lLMChat4; int $i$a$-chainIfNotNull-ChatRequestBuilder$buildV7$15 = 0; Attributes attributes1 = object3.put((Attributes.Key)LLMParameters.INSTANCE.getReasoningEffort(), (Attributes.Value)new Attributes.Value.Text((String)object2, null, 2, null));
/*     */     } 
/* 323 */     $this$chainIfNotNull$iv = $this$chainIfNotNull$iv; boolean condition$iv = ((!this.functionsCachingPoints.isEmpty()) || (!this.messagesCachingPoints.isEmpty())); int $i$f$chainIf = 0;
/* 324 */     if (condition$iv) {
/* 325 */       LLMProfileID lLMProfileID1; Object object2 = $this$chainIfNotNull$iv; LLMChat lLMChat4 = this.messages, lLMChat3 = lLMChat4; int $i$a$-chainIf-ChatRequestBuilder$buildV7$16 = 0; JSON jSON = (JSON)JSON.Default.INSTANCE; Object object3 = new LLMCachePoints(this.functionsCachingPoints, this.messagesCachingPoints); int $i$f$string = 0;
/*     */     } 
/* 327 */     Object object1 = $this$chainIfNotNull$iv;
/*     */     LLMChat lLMChat1 = this.messages, lLMChat2 = lLMChat1;
/*     */     return new LlmAPI.Chat.Stream.V7.Request((LLMPromptID)lLMProfileID, (LLMProfileID)lLMChat2, lLMChat1, (Attributes)object1); }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\api-gateway-client-jvm-0.4.32.jar!\ai\grazie\api\gateway\client\api\llm\ChatRequestBuilder.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */