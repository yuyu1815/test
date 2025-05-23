/*     */ package com.intellij.ml.llm.matterhorn.requests;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ProjectFileStructure;
/*     */ import com.intellij.ml.llm.matterhorn.llm.MatterhornTool;
/*     */ import com.intellij.ml.llm.matterhorn.llm.MatterhornToolChoice;
/*     */ import com.intellij.ml.llm.matterhorn.requests.builder.AssistantAnswerFormat;
/*     */ import com.intellij.ml.llm.matterhorn.requests.builder.AssistantMessageConsumer;
/*     */ import com.intellij.ml.llm.matterhorn.requests.builder.AssistantMessageHandler;
/*     */ import com.intellij.ml.llm.matterhorn.requests.builder.AssistantMessageReviewer;
/*     */ import com.intellij.ml.llm.matterhorn.requests.builder.MatterhornToolUsageHandler;
/*     */ import com.intellij.ml.llm.matterhorn.requests.builder.ReviewStrategy;
/*     */ import com.intellij.ml.llm.matterhorn.requests.builder.UserMessageBuilder;
/*     */ import io.ktor.http.ContentType;
/*     */ import java.util.List;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\001\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\004\n\002\020\016\n\000\n\002\030\002\n\002\b\007\n\002\030\002\n\000\n\002\020\022\n\002\b\003\n\002\020\b\n\000\n\002\030\002\n\002\020\013\n\002\b\003\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\002\n\002\b\002\030\0002\0020\001:\001>B\021\b\002\022\006\020\002\032\0020\003¢\006\004\b\004\020\005B\021\b\026\022\006\020\002\032\0020\006¢\006\004\b\004\020\007B\t\b\026¢\006\004\b\004\020\bJ\032\020\t\032\0020\0002\006\020\n\032\0020\0132\n\b\002\020\f\032\004\030\0010\rJ\032\020\016\032\0020\0002\006\020\n\032\0020\0132\n\b\002\020\f\032\004\030\0010\rJ\032\020\017\032\0020\0002\006\020\020\032\0020\0132\n\b\002\020\021\032\004\030\0010\013J\032\020\022\032\0020\0002\006\020\020\032\0020\0132\n\b\002\020\021\032\004\030\0010\013J\"\020\023\032\0020\0002\006\020\024\032\0020\0252\006\020\026\032\0020\0272\n\b\002\020\030\032\004\030\0010\013J$\020\031\032\0020\0002\b\b\002\020\032\032\0020\0332\022\020\034\032\016\022\004\022\0020\013\022\004\022\0020\0360\035J\030\020\037\032\0020\0002\b\b\002\020 \032\0020\0362\006\020!\032\0020\"J\030\020#\032\0020\0002\b\b\002\020$\032\0020%2\006\020&\032\0020'J\016\020(\032\0020\0002\006\020)\032\0020*J\026\020+\032\0020\0002\006\020,\032\0020-2\006\020.\032\0020/J\016\0200\032\0020\0002\006\0201\032\00202J\016\0203\032\0020\0002\006\0204\032\0020\033J\020\0205\032\0020\0002\b\0205\032\004\030\00106J\016\0207\032\002082\006\0209\032\0020:J\006\020;\032\0020\006J\016\020<\032\0020=2\006\020\002\032\0020\006R\016\020\002\032\0020\003X\004¢\006\002\n\000¨\006?"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/requests/GrazieRequestBuilder;", "", "template", "Lcom/intellij/ml/llm/matterhorn/requests/GrazieRequestBuilder$TemplateImpl;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/requests/GrazieRequestBuilder$TemplateImpl;)V", "Lcom/intellij/ml/llm/matterhorn/requests/GrazieRequestTemplate;", "(Lcom/intellij/ml/llm/matterhorn/requests/GrazieRequestTemplate;)V", "()V", "addSystemFile", "filePath", "", "source", "Lcom/intellij/ml/llm/matterhorn/ProjectFileStructure;", "addUserFile", "addSystemMessage", "message", "title", "addUserMessage", "addUserImage", "contentType", "Lio/ktor/http/ContentType;", "imageData", "", "imageName", "completionCheck", "maxRequests", "", "check", "Lkotlin/Function1;", "", "addResultConsumer", "applyToFailed", "consumer", "Lcom/intellij/ml/llm/matterhorn/requests/builder/AssistantMessageConsumer;", "addReviewer", "strategy", "Lcom/intellij/ml/llm/matterhorn/requests/builder/ReviewStrategy;", "reviewer", "Lcom/intellij/ml/llm/matterhorn/requests/builder/AssistantMessageReviewer;", "addCounterpart", "counterpart", "Lcom/intellij/ml/llm/matterhorn/requests/builder/AssistantMessageCounterpart;", "addTool", "tool", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornTool;", "handler", "Lcom/intellij/ml/llm/matterhorn/requests/builder/MatterhornToolUsageHandler;", "toolChoice", "choice", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornToolChoice;", "maxRetries", "value", "answerFormat", "Lcom/intellij/ml/llm/matterhorn/requests/builder/AssistantAnswerFormat;", "build", "Lcom/intellij/ml/llm/matterhorn/requests/GrazieRequest;", "modelParameters", "Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;", "buildTemplate", "applyTemplate", "", "TemplateImpl", "core"})
/*     */ @SourceDebugExtension({"SMAP\nGrazieRequestBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GrazieRequestBuilder.kt\ncom/intellij/ml/llm/matterhorn/requests/GrazieRequestBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,200:1\n1#2:201\n*E\n"})
/*     */ public final class GrazieRequestBuilder {
/*  23 */   private GrazieRequestBuilder(TemplateImpl template) { this.template = template; } @NotNull
/*  24 */   private final TemplateImpl template; public GrazieRequestBuilder(@NotNull GrazieRequestTemplate template) { this();
/*  25 */     applyTemplate(template); }
/*     */    public GrazieRequestBuilder() {
/*  27 */     this(new TemplateImpl());
/*     */   }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final GrazieRequestBuilder addSystemFile(@NotNull String filePath, @Nullable ProjectFileStructure source) {
/*  33 */     Intrinsics.checkNotNullParameter(filePath, "filePath"); this.template.getSystem().add(new FileContent(filePath, source));
/*  34 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final GrazieRequestBuilder addUserFile(@NotNull String filePath, @Nullable ProjectFileStructure source) {
/*  41 */     Intrinsics.checkNotNullParameter(filePath, "filePath"); UserMessageBuilder.addFile-impl(this.template.getUser-r-9Q-JA(), filePath, source);
/*  42 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final GrazieRequestBuilder addSystemMessage(@NotNull String message, @Nullable String title) {
/*  49 */     Intrinsics.checkNotNullParameter(message, "message"); this.template.getSystem().add(new TextContent(message, title));
/*  50 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final GrazieRequestBuilder addUserMessage(@NotNull String message, @Nullable String title) {
/*  57 */     Intrinsics.checkNotNullParameter(message, "message"); UserMessageBuilder.addText-aPqWSj0(this.template.getUser-r-9Q-JA(), message, title);
/*  58 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final GrazieRequestBuilder addUserImage(@NotNull ContentType contentType, @NotNull byte[] imageData, @Nullable String imageName) {
/*  66 */     Intrinsics.checkNotNullParameter(contentType, "contentType"); Intrinsics.checkNotNullParameter(imageData, "imageData"); UserMessageBuilder.addImage-AgeAp1E(this.template.getUser-r-9Q-JA(), contentType, imageData, imageName);
/*  67 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final GrazieRequestBuilder completionCheck(int maxRequests, @NotNull Function1<? super String, Boolean> check) {
/*  75 */     Intrinsics.checkNotNullParameter(check, "check"); this.template.setCompletionCheck(check);
/*  76 */     this.template.setMaxCompletionRequests(Math.max(maxRequests, 0));
/*  77 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final GrazieRequestBuilder addResultConsumer(boolean applyToFailed, @NotNull AssistantMessageConsumer consumer) {
/*  85 */     Intrinsics.checkNotNullParameter(consumer, "consumer"); this.template.getHandlers().add(new AssistantMessageConsumerHandler(applyToFailed, consumer));
/*  86 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final GrazieRequestBuilder addReviewer(@NotNull ReviewStrategy strategy, @NotNull AssistantMessageReviewer reviewer) {
/*  94 */     Intrinsics.checkNotNullParameter(strategy, "strategy"); Intrinsics.checkNotNullParameter(reviewer, "reviewer"); TemplateImpl templateImpl = this.template; int i = templateImpl.getReviewersCount(); templateImpl.setReviewersCount(i + 1); this.template.getHandlers().add(new AssistantMessageReviewHandler(i, strategy, reviewer));
/*  95 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final GrazieRequestBuilder addCounterpart(@NotNull AssistantMessageCounterpart counterpart) {
/* 101 */     Intrinsics.checkNotNullParameter(counterpart, "counterpart"); GrazieRequestBuilder grazieRequestBuilder1 = this, $this$addCounterpart_u24lambda_u240 = grazieRequestBuilder1; int $i$a$-apply-GrazieRequestBuilder$addCounterpart$1 = 0;
/* 102 */     $this$addCounterpart_u24lambda_u240.template.getHandlers().add(new AssistantMessageCounterpartHandler(counterpart));
/*     */     return grazieRequestBuilder1;
/*     */   }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final GrazieRequestBuilder addTool(@NotNull MatterhornTool tool, @NotNull MatterhornToolUsageHandler handler) {
/* 109 */     Intrinsics.checkNotNullParameter(tool, "tool"); Intrinsics.checkNotNullParameter(handler, "handler"); this.template.getTools().put(tool, handler);
/* 110 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final GrazieRequestBuilder toolChoice(@NotNull MatterhornToolChoice choice) {
/* 119 */     Intrinsics.checkNotNullParameter(choice, "choice"); this.template.setToolChoice(choice);
/* 120 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final GrazieRequestBuilder maxRetries(int value) {
/* 127 */     this.template.setMaxRetries(Math.max(value, 1));
/* 128 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final GrazieRequestBuilder answerFormat(@Nullable AssistantAnswerFormat answerFormat) {
/* 135 */     this.template.setAssistantAnswerFormat(answerFormat);
/* 136 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final GrazieRequest build(@NotNull ModelParameters modelParameters) {
/* 142 */     Intrinsics.checkNotNullParameter(modelParameters, "modelParameters"); TemplateImpl $this$build_u24lambda_u241 = this.template; int $i$a$-with-GrazieRequestBuilder$build$1 = 0;
/* 143 */     return (GrazieRequest)new GrazieRequestImpl(
/* 144 */         $this$build_u24lambda_u241.getSystem(), 
/* 145 */         UserMessageBuilder.build-impl($this$build_u24lambda_u241.getUser-r-9Q-JA()), 
/* 146 */         modelParameters, 
/* 147 */         $this$build_u24lambda_u241.getMaxRetries(), 
/* 148 */         $this$build_u24lambda_u241.getHandlers(), 
/* 149 */         $this$build_u24lambda_u241.getReviewersCount(), 
/* 150 */         $this$build_u24lambda_u241.getTools(), 
/* 151 */         $this$build_u24lambda_u241.getToolChoice(), 
/* 152 */         $this$build_u24lambda_u241.getCompletionCheck(), 
/* 153 */         $this$build_u24lambda_u241.getMaxCompletionRequests(), 
/* 154 */         $this$build_u24lambda_u241.getAssistantAnswerFormat());
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final GrazieRequestTemplate buildTemplate() {
/* 161 */     TemplateImpl templateImpl1 = new TemplateImpl(), it = templateImpl1;
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
/* 201 */     int $i$a$-also-GrazieRequestBuilder$buildTemplate$1 = 0;
/*     */     this.template.applyTo(it);
/*     */     return templateImpl1;
/*     */   }
/*     */   
/*     */   public final void applyTemplate(@NotNull GrazieRequestTemplate template) {
/*     */     Intrinsics.checkNotNullParameter(template, "template");
/*     */     if (template instanceof TemplateImpl) {
/*     */       ((TemplateImpl)template).applyTo(this.template);
/*     */     } else {
/*     */       throw new NoWhenBranchMatchedException();
/*     */     } 
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000h\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020!\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\004\n\002\020%\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\005\n\002\030\002\n\002\020\016\n\002\020\013\n\002\b\005\n\002\020\b\n\002\b\005\n\002\030\002\n\002\b\b\n\002\030\002\n\002\b\005\n\002\020\002\n\002\b\002\b\002\030\0002\0020\001B\007¢\006\004\b\002\020\003J\016\0207\032\002082\006\0209\032\0020\000R\027\020\004\032\b\022\004\022\0020\0060\005¢\006\b\n\000\032\004\b\007\020\bR\023\020\t\032\0020\n¢\006\n\n\002\020\r\032\004\b\013\020\fR\035\020\016\032\016\022\004\022\0020\020\022\004\022\0020\0210\017¢\006\b\n\000\032\004\b\022\020\023R\032\020\024\032\0020\025X\016¢\006\016\n\000\032\004\b\026\020\027\"\004\b\030\020\031R&\020\032\032\016\022\004\022\0020\034\022\004\022\0020\0350\033X\016¢\006\016\n\000\032\004\b\036\020\037\"\004\b \020!R\032\020\"\032\0020#X\016¢\006\016\n\000\032\004\b$\020%\"\004\b&\020'R\027\020(\032\b\022\004\022\0020)0\005¢\006\b\n\000\032\004\b*\020\bR\032\020+\032\0020#X\016¢\006\016\n\000\032\004\b,\020%\"\004\b-\020'R\032\020.\032\0020#X\016¢\006\016\n\000\032\004\b/\020%\"\004\b0\020'R\034\0201\032\004\030\00102X\016¢\006\016\n\000\032\004\b3\0204\"\004\b5\0206¨\006:"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/requests/GrazieRequestBuilder$TemplateImpl;", "Lcom/intellij/ml/llm/matterhorn/requests/GrazieRequestTemplate;", "<init>", "()V", "system", "", "Lcom/intellij/ml/llm/matterhorn/requests/GrazieRequest$Content;", "getSystem", "()Ljava/util/List;", "user", "Lcom/intellij/ml/llm/matterhorn/requests/builder/UserMessageBuilder;", "getUser-r-9Q-JA", "()Lcom/intellij/ml/llm/matterhorn/collections/AddOnlyList;", "Lcom/intellij/ml/llm/matterhorn/collections/AddOnlyList;", "tools", "", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornTool;", "Lcom/intellij/ml/llm/matterhorn/requests/builder/MatterhornToolUsageHandler;", "getTools", "()Ljava/util/Map;", "toolChoice", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornToolChoice;", "getToolChoice", "()Lcom/intellij/ml/llm/matterhorn/llm/MatterhornToolChoice;", "setToolChoice", "(Lcom/intellij/ml/llm/matterhorn/llm/MatterhornToolChoice;)V", "completionCheck", "Lkotlin/Function1;", "", "", "getCompletionCheck", "()Lkotlin/jvm/functions/Function1;", "setCompletionCheck", "(Lkotlin/jvm/functions/Function1;)V", "maxCompletionRequests", "", "getMaxCompletionRequests", "()I", "setMaxCompletionRequests", "(I)V", "handlers", "Lcom/intellij/ml/llm/matterhorn/requests/builder/AssistantMessageHandler;", "getHandlers", "maxRetries", "getMaxRetries", "setMaxRetries", "reviewersCount", "getReviewersCount", "setReviewersCount", "assistantAnswerFormat", "Lcom/intellij/ml/llm/matterhorn/requests/builder/AssistantAnswerFormat;", "getAssistantAnswerFormat", "()Lcom/intellij/ml/llm/matterhorn/requests/builder/AssistantAnswerFormat;", "setAssistantAnswerFormat", "(Lcom/intellij/ml/llm/matterhorn/requests/builder/AssistantAnswerFormat;)V", "applyTo", "", "target", "core"})
/*     */   private static final class TemplateImpl implements GrazieRequestTemplate {
/*     */     @NotNull
/*     */     private final List<GrazieRequest.Content> system = new ArrayList<>();
/*     */     
/*     */     @NotNull
/*     */     public final List<GrazieRequest.Content> getSystem() {
/*     */       return this.system;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     private final AddOnlyList<GrazieRequest.Content> user = UserMessageBuilder.constructor-impl();
/*     */     
/*     */     @NotNull
/*     */     public final AddOnlyList<GrazieRequest.Content> getUser-r-9Q-JA() {
/*     */       return this.user;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     private final Map<MatterhornTool, MatterhornToolUsageHandler> tools = new LinkedHashMap<>();
/*     */     
/*     */     @NotNull
/*     */     public final Map<MatterhornTool, MatterhornToolUsageHandler> getTools() {
/*     */       return this.tools;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     private MatterhornToolChoice toolChoice = (MatterhornToolChoice)new MatterhornToolChoice.Auto(false, 1, null);
/*     */     
/*     */     @NotNull
/*     */     public final MatterhornToolChoice getToolChoice() {
/*     */       return this.toolChoice;
/*     */     }
/*     */     
/*     */     public final void setToolChoice(@NotNull MatterhornToolChoice <set-?>) {
/*     */       Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
/*     */       this.toolChoice = <set-?>;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     private Function1<? super String, Boolean> completionCheck = TemplateImpl::completionCheck$lambda$0;
/*     */     
/*     */     @NotNull
/*     */     public final Function1<String, Boolean> getCompletionCheck() {
/*     */       return (Function1)this.completionCheck;
/*     */     }
/*     */     
/*     */     public final void setCompletionCheck(@NotNull Function1<? super String, Boolean> <set-?>) {
/*     */       Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
/*     */       this.completionCheck = <set-?>;
/*     */     }
/*     */     
/*     */     private static final boolean completionCheck$lambda$0(String it) {
/*     */       Intrinsics.checkNotNullParameter(it, "it");
/*     */       return true;
/*     */     }
/*     */     
/*     */     private int maxCompletionRequests = 2;
/*     */     
/*     */     public final int getMaxCompletionRequests() {
/*     */       return this.maxCompletionRequests;
/*     */     }
/*     */     
/*     */     public final void setMaxCompletionRequests(int <set-?>) {
/*     */       this.maxCompletionRequests = <set-?>;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     private final List<AssistantMessageHandler> handlers = new ArrayList<>();
/*     */     
/*     */     @NotNull
/*     */     public final List<AssistantMessageHandler> getHandlers() {
/*     */       return this.handlers;
/*     */     }
/*     */     
/*     */     private int maxRetries = 3;
/*     */     private int reviewersCount;
/*     */     @Nullable
/*     */     private AssistantAnswerFormat assistantAnswerFormat;
/*     */     
/*     */     public final int getMaxRetries() {
/*     */       return this.maxRetries;
/*     */     }
/*     */     
/*     */     public final void setMaxRetries(int <set-?>) {
/*     */       this.maxRetries = <set-?>;
/*     */     }
/*     */     
/*     */     public final int getReviewersCount() {
/*     */       return this.reviewersCount;
/*     */     }
/*     */     
/*     */     public final void setReviewersCount(int <set-?>) {
/*     */       this.reviewersCount = <set-?>;
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final AssistantAnswerFormat getAssistantAnswerFormat() {
/*     */       return this.assistantAnswerFormat;
/*     */     }
/*     */     
/*     */     public final void setAssistantAnswerFormat(@Nullable AssistantAnswerFormat <set-?>) {
/*     */       this.assistantAnswerFormat = <set-?>;
/*     */     }
/*     */     
/*     */     public final void applyTo(@NotNull TemplateImpl target) {
/*     */       Intrinsics.checkNotNullParameter(target, "target");
/*     */       target.system.addAll(this.system);
/*     */       UserMessageBuilder.addFrom-U-FbYDk(target.user, this.user);
/*     */       target.tools.putAll(this.tools);
/*     */       target.toolChoice = this.toolChoice;
/*     */       target.completionCheck = this.completionCheck;
/*     */       target.maxCompletionRequests = this.maxCompletionRequests;
/*     */       target.handlers.addAll(this.handlers);
/*     */       target.maxRetries = this.maxRetries;
/*     */       target.reviewersCount = this.reviewersCount;
/*     */       target.assistantAnswerFormat = this.assistantAnswerFormat;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\requests\GrazieRequestBuilder.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */