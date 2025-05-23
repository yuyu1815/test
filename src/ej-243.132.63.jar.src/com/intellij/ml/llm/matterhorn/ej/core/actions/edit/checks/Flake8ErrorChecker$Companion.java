/*     */ package com.intellij.ml.llm.matterhorn.ej.core.actions.edit.checks;
/*     */ 
/*     */ import com.intellij.openapi.diagnostic.Logger;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.CollectionsKt;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020 \n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\013\n\002\b\002\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\024\020\004\032\b\022\004\022\0020\0060\0052\006\020\007\032\0020\bR\022\020\t\032\004\030\0010\nX\016¢\006\004\n\002\020\013R\021\020\f\032\0020\r¢\006\b\n\000\032\004\b\016\020\017¨\006\020"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/Flake8ErrorChecker$Companion;", "", "<init>", "()V", "parseLintErrors", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/LineColumnError;", "output", "", "flake8IsAvailable", "", "Ljava/lang/Boolean;", "logger", "Lcom/intellij/openapi/diagnostic/Logger;", "getLogger", "()Lcom/intellij/openapi/diagnostic/Logger;", "ej-core"})
/*     */ public final class Companion
/*     */ {
/*     */   private Companion() {}
/*     */   
/*     */   @NotNull
/*     */   public final List<LineColumnError> parseLintErrors(@NotNull String output) {
/* 136 */     Intrinsics.checkNotNullParameter(output, "output"); List<LineColumnError> errors = new ArrayList();
/* 137 */     for (String line : StringsKt.lineSequence(output)) {
/* 138 */       String[] arrayOfString = new String[1]; arrayOfString[0] = ":"; List<String> parts = StringsKt.split$default(line, arrayOfString, false, 0, 6, null);
/* 139 */       if (parts.size() >= 4) {
/* 140 */         StringsKt.toIntOrNull(parts.get(1)); int i = (StringsKt.toIntOrNull(parts.get(1)) != null) ? StringsKt.toIntOrNull(parts.get(1)).intValue() : 0;
/* 141 */         StringsKt.toIntOrNull(parts.get(2)); int column = (StringsKt.toIntOrNull(parts.get(2)) != null) ? StringsKt.toIntOrNull(parts.get(2)).intValue() : 0;
/* 142 */         String text = StringsKt.trim(CollectionsKt.joinToString$default(CollectionsKt.drop(parts, 3), ":", null, null, 0, null, null, 62, null)).toString();
/* 143 */         errors.add(new LineColumnError(i, column, text));
/*     */       } 
/*     */     } 
/* 146 */     return errors;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Logger getLogger() {
/* 151 */     return Flake8ErrorChecker.access$getLogger$cp();
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\actions\edit\checks\Flake8ErrorChecker$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */