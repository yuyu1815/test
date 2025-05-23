/*     */ package com.intellij.ml.llm.matterhorn.requests;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.InvalidContentFormatException;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import java.util.regex.Matcher;
/*     */ import java.util.regex.Pattern;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.text.StringsKt;
/*     */ import org.jetbrains.annotations.NotNull;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020!\n\002\020\016\n\002\b\002\n\002\030\002\n\000\n\002\020\b\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\024\020\004\032\b\022\004\022\0020\0060\0052\006\020\007\032\0020\006J\030\020\b\032\0020\t2\006\020\007\032\0020\0062\006\020\n\032\0020\013H\002¨\006\f"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/requests/ExtractCodeRequest$Companion;", "", "<init>", "()V", "extractCodeFragments", "", "", "text", "review", "Lcom/intellij/ml/llm/matterhorn/requests/ReviewerResponse;", "attempt", "", "core"})
/*     */ public final class Companion
/*     */ {
/*     */   private Companion() {}
/*     */   
/*     */   @NotNull
/*     */   public final List<String> extractCodeFragments(@NotNull String text) {
/* 110 */     Intrinsics.checkNotNullParameter(text, "text"); String patternString = "```(`)*(?:[\\w ]+)?(.*)```(`)*";
/* 111 */     Pattern pattern = Pattern.compile(patternString, 32);
/* 112 */     Matcher matcher = pattern.matcher(text);
/*     */     
/* 114 */     List<String> fragments = new ArrayList();
/* 115 */     while (matcher.find()) {
/* 116 */       Intrinsics.checkNotNullExpressionValue(matcher.group(2), "group(...)"); fragments.add(StringsKt.trim(matcher.group(2)).toString());
/*     */     } 
/* 118 */     return fragments;
/*     */   }
/*     */   
/*     */   private final ReviewerResponse review(String text, int attempt) {
/* 122 */     List<String> fragments = extractCodeFragments(text);
/*     */     
/* 124 */     if (attempt > 3) {
/* 125 */       throw new InvalidContentFormatException("Can not extract code fragment from answer");
/*     */     }
/* 127 */     return fragments.isEmpty() ? 
/* 128 */       new ReviewerResponse.Error("The answer contains no code fragment in ``` and ```. Make sure it contains only one code fragment!", null, 2, null) : (
/* 129 */       (fragments.size() > 1) ? 
/* 130 */       new ReviewerResponse.Error("The answer contains " + fragments.size() + " code fragments in ``` and ```. Make sure it contains only one code fragment!", null, 2, null) : 
/* 131 */       ReviewerResponse.OK.INSTANCE);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\requests\ExtractCodeRequest$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */