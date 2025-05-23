/*     */ package com.intellij.ml.llm.matterhorn.requests;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.collections.AddOnlyList;
/*     */ import com.intellij.ml.llm.matterhorn.llm.MatterhornTool;
/*     */ import com.intellij.ml.llm.matterhorn.llm.MatterhornToolChoice;
/*     */ import com.intellij.ml.llm.matterhorn.requests.builder.AssistantAnswerFormat;
/*     */ import com.intellij.ml.llm.matterhorn.requests.builder.AssistantMessageHandler;
/*     */ import com.intellij.ml.llm.matterhorn.requests.builder.MatterhornToolUsageHandler;
/*     */ import com.intellij.ml.llm.matterhorn.requests.builder.UserMessageBuilder;
/*     */ import java.util.ArrayList;
/*     */ import java.util.LinkedHashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000h\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020!\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\004\n\002\020%\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\005\n\002\030\002\n\002\020\016\n\002\020\013\n\002\b\005\n\002\020\b\n\002\b\005\n\002\030\002\n\002\b\b\n\002\030\002\n\002\b\005\n\002\020\002\n\002\b\002\b\002\030\0002\0020\001B\007¢\006\004\b\002\020\003J\016\0207\032\002082\006\0209\032\0020\000R\027\020\004\032\b\022\004\022\0020\0060\005¢\006\b\n\000\032\004\b\007\020\bR\023\020\t\032\0020\n¢\006\n\n\002\020\r\032\004\b\013\020\fR\035\020\016\032\016\022\004\022\0020\020\022\004\022\0020\0210\017¢\006\b\n\000\032\004\b\022\020\023R\032\020\024\032\0020\025X\016¢\006\016\n\000\032\004\b\026\020\027\"\004\b\030\020\031R&\020\032\032\016\022\004\022\0020\034\022\004\022\0020\0350\033X\016¢\006\016\n\000\032\004\b\036\020\037\"\004\b \020!R\032\020\"\032\0020#X\016¢\006\016\n\000\032\004\b$\020%\"\004\b&\020'R\027\020(\032\b\022\004\022\0020)0\005¢\006\b\n\000\032\004\b*\020\bR\032\020+\032\0020#X\016¢\006\016\n\000\032\004\b,\020%\"\004\b-\020'R\032\020.\032\0020#X\016¢\006\016\n\000\032\004\b/\020%\"\004\b0\020'R\034\0201\032\004\030\00102X\016¢\006\016\n\000\032\004\b3\0204\"\004\b5\0206¨\006:"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/requests/GrazieRequestBuilder$TemplateImpl;", "Lcom/intellij/ml/llm/matterhorn/requests/GrazieRequestTemplate;", "<init>", "()V", "system", "", "Lcom/intellij/ml/llm/matterhorn/requests/GrazieRequest$Content;", "getSystem", "()Ljava/util/List;", "user", "Lcom/intellij/ml/llm/matterhorn/requests/builder/UserMessageBuilder;", "getUser-r-9Q-JA", "()Lcom/intellij/ml/llm/matterhorn/collections/AddOnlyList;", "Lcom/intellij/ml/llm/matterhorn/collections/AddOnlyList;", "tools", "", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornTool;", "Lcom/intellij/ml/llm/matterhorn/requests/builder/MatterhornToolUsageHandler;", "getTools", "()Ljava/util/Map;", "toolChoice", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornToolChoice;", "getToolChoice", "()Lcom/intellij/ml/llm/matterhorn/llm/MatterhornToolChoice;", "setToolChoice", "(Lcom/intellij/ml/llm/matterhorn/llm/MatterhornToolChoice;)V", "completionCheck", "Lkotlin/Function1;", "", "", "getCompletionCheck", "()Lkotlin/jvm/functions/Function1;", "setCompletionCheck", "(Lkotlin/jvm/functions/Function1;)V", "maxCompletionRequests", "", "getMaxCompletionRequests", "()I", "setMaxCompletionRequests", "(I)V", "handlers", "Lcom/intellij/ml/llm/matterhorn/requests/builder/AssistantMessageHandler;", "getHandlers", "maxRetries", "getMaxRetries", "setMaxRetries", "reviewersCount", "getReviewersCount", "setReviewersCount", "assistantAnswerFormat", "Lcom/intellij/ml/llm/matterhorn/requests/builder/AssistantAnswerFormat;", "getAssistantAnswerFormat", "()Lcom/intellij/ml/llm/matterhorn/requests/builder/AssistantAnswerFormat;", "setAssistantAnswerFormat", "(Lcom/intellij/ml/llm/matterhorn/requests/builder/AssistantAnswerFormat;)V", "applyTo", "", "target", "core"})
/*     */ final class TemplateImpl
/*     */   implements GrazieRequestTemplate
/*     */ {
/*     */   @NotNull
/* 173 */   private final List<GrazieRequest.Content> system = new ArrayList<>(); @NotNull public final List<GrazieRequest.Content> getSystem() { return this.system; } @NotNull
/* 174 */   private final AddOnlyList<GrazieRequest.Content> user = UserMessageBuilder.constructor-impl(); @NotNull public final AddOnlyList<GrazieRequest.Content> getUser-r-9Q-JA() { return this.user; } @NotNull
/* 175 */   private final Map<MatterhornTool, MatterhornToolUsageHandler> tools = new LinkedHashMap<>(); @NotNull public final Map<MatterhornTool, MatterhornToolUsageHandler> getTools() { return this.tools; } @NotNull
/* 176 */   private MatterhornToolChoice toolChoice = (MatterhornToolChoice)new MatterhornToolChoice.Auto(false, 1, null); @NotNull public final MatterhornToolChoice getToolChoice() { return this.toolChoice; } public final void setToolChoice(@NotNull MatterhornToolChoice <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, "<set-?>"); this.toolChoice = <set-?>; } @NotNull
/* 177 */   private Function1<? super String, Boolean> completionCheck = TemplateImpl::completionCheck$lambda$0; @NotNull public final Function1<String, Boolean> getCompletionCheck() { return (Function1)this.completionCheck; } public final void setCompletionCheck(@NotNull Function1<? super String, Boolean> <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, "<set-?>"); this.completionCheck = <set-?>; } private static final boolean completionCheck$lambda$0(String it) { Intrinsics.checkNotNullParameter(it, "it"); return true; }
/*     */ 
/*     */   
/* 180 */   private int maxCompletionRequests = 2; public final int getMaxCompletionRequests() { return this.maxCompletionRequests; } public final void setMaxCompletionRequests(int <set-?>) { this.maxCompletionRequests = <set-?>; } @NotNull
/* 181 */   private final List<AssistantMessageHandler> handlers = new ArrayList<>(); @NotNull public final List<AssistantMessageHandler> getHandlers() { return this.handlers; }
/* 182 */    private int reviewersCount; private int maxRetries = 3; @Nullable private AssistantAnswerFormat assistantAnswerFormat; public final int getMaxRetries() { return this.maxRetries; } public final void setMaxRetries(int <set-?>) { this.maxRetries = <set-?>; }
/* 183 */   public final int getReviewersCount() { return this.reviewersCount; } public final void setReviewersCount(int <set-?>) { this.reviewersCount = <set-?>; } @Nullable
/* 184 */   public final AssistantAnswerFormat getAssistantAnswerFormat() { return this.assistantAnswerFormat; } public final void setAssistantAnswerFormat(@Nullable AssistantAnswerFormat <set-?>) { this.assistantAnswerFormat = <set-?>; }
/*     */   
/*     */   public final void applyTo(@NotNull TemplateImpl target) {
/* 187 */     Intrinsics.checkNotNullParameter(target, "target"); target.system.addAll(this.system);
/* 188 */     UserMessageBuilder.addFrom-U-FbYDk(target.user, this.user);
/* 189 */     target.tools.putAll(this.tools);
/* 190 */     target.toolChoice = this.toolChoice;
/* 191 */     target.completionCheck = this.completionCheck;
/* 192 */     target.maxCompletionRequests = this.maxCompletionRequests;
/* 193 */     target.handlers.addAll(this.handlers);
/* 194 */     target.maxRetries = this.maxRetries;
/* 195 */     target.reviewersCount = this.reviewersCount;
/* 196 */     target.assistantAnswerFormat = this.assistantAnswerFormat;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\requests\GrazieRequestBuilder$TemplateImpl.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */