/*     */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session;
/*     */ 
/*     */ import java.util.Locale;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.enums.EnumEntries;
/*     */ import kotlin.enums.EnumEntriesKt;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.text.StringsKt;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\020\020\n\002\b\022\n\002\020\016\n\002\b\002\n\002\020\b\n\002\b\t\b\002\030\0002\b\022\004\022\0020\0000\001B\t\b\002¢\006\004\b\002\020\003J\b\020\025\032\0020\024H\002J\020\020\026\032\0020\0272\b\020\030\032\004\030\0010\024J\020\020\031\032\0020\0242\b\020\030\032\004\030\0010\024J\022\020\032\032\004\030\0010\0242\b\020\030\032\004\030\0010\024J\022\020\033\032\004\030\0010\0242\b\020\030\032\004\030\0010\024J\024\020\034\032\004\030\0010\0242\b\020\030\032\004\030\0010\024H\002J\023\020\035\032\002H\036\"\004\b\000\020\036H\002¢\006\002\020\037R\016\020\023\032\0020\024X\004¢\006\002\n\000j\002\b\004j\002\b\005j\002\b\006j\002\b\007j\002\b\bj\002\b\tj\002\b\nj\002\b\013j\002\b\fj\002\b\rj\002\b\016j\002\b\017j\002\b\020j\002\b\021j\002\b\022¨\006 "}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandManager$Param;", "", "<init>", "(Ljava/lang/String;I)V", "EXIT_CODE", "COMMAND", "HISTORY_STRING", "REQUEST_ID", "RESULT", "CURRENT_DIRECTORY", "USER_NAME", "USER_HOME", "GIT_BRANCH", "VIRTUAL_ENV", "CONDA_ENV", "SHELL_EDITOR_BUFFER", "ORIGINAL_PROMPT", "ORIGINAL_RIGHT_PROMPT", "SHELL_INFO", "paramNameWithSeparator", "", "paramName", "getIntValue", "", "nameAndValue", "getDecodedValue", "getDecodedNotEmptyValueOrNull", "getDecodedValueOrNull", "getValueOrNull", "fail", "T", "()Ljava/lang/Object;", "ej-core"})
/*     */ @SourceDebugExtension({"SMAP\nShellCommandManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShellCommandManager.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandManager$Param\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,306:1\n1#2:307\n*E\n"})
/*     */ enum Param
/*     */ {
/* 228 */   EXIT_CODE,
/* 229 */   COMMAND,
/* 230 */   HISTORY_STRING,
/* 231 */   REQUEST_ID,
/* 232 */   RESULT,
/* 233 */   CURRENT_DIRECTORY,
/* 234 */   USER_NAME,
/* 235 */   USER_HOME,
/* 236 */   GIT_BRANCH,
/* 237 */   VIRTUAL_ENV,
/* 238 */   CONDA_ENV,
/* 239 */   SHELL_EDITOR_BUFFER,
/* 240 */   ORIGINAL_PROMPT,
/* 241 */   ORIGINAL_RIGHT_PROMPT,
/*     */ 
/*     */   
/* 244 */   SHELL_INFO; @NotNull
/*     */   private final String paramNameWithSeparator; Param() {
/* 246 */     this.paramNameWithSeparator = paramName() + "=";
/*     */   } private final String paramName() {
/* 248 */     String str = name(); Intrinsics.checkNotNullExpressionValue(Locale.ENGLISH, "ENGLISH"); Intrinsics.checkNotNullExpressionValue(str.toLowerCase(Locale.ENGLISH), "toLowerCase(...)"); return str.toLowerCase(Locale.ENGLISH);
/*     */   }
/*     */   public final int getIntValue(@Nullable String nameAndValue) {
/* 251 */     StringsKt.toIntOrNull(getValueOrNull(nameAndValue)); return (getValueOrNull(nameAndValue) != null && StringsKt.toIntOrNull(getValueOrNull(nameAndValue)) != null) ? StringsKt.toIntOrNull(getValueOrNull(nameAndValue)).intValue() : ((Number)fail()).intValue();
/*     */   } @NotNull
/*     */   public final String getDecodedValue(@Nullable String nameAndValue) {
/* 254 */     if (getDecodedValueOrNull(nameAndValue) == null) getDecodedValueOrNull(nameAndValue);  return fail();
/*     */   }
/*     */   @Nullable
/* 257 */   public final String getDecodedNotEmptyValueOrNull(@Nullable String nameAndValue) { String str1 = getDecodedValueOrNull(nameAndValue), it = str1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 307 */     int $i$a$-takeIf-ShellCommandManager$Param$getDecodedNotEmptyValueOrNull$1 = 0; getDecodedValueOrNull(nameAndValue); return (getDecodedValueOrNull(nameAndValue) != null) ? (((it.length() > 0)) ? str1 : null) : null; } private final String getValueOrNull(String nameAndValue) { if (nameAndValue != null) { String str1 = nameAndValue, it = str1; int $i$a$-takeIf-ShellCommandManager$Param$getValueOrNull$1 = 0;
/*     */       if ((StringsKt.startsWith$default(it, this.paramNameWithSeparator, false, 2, null) ? str1 : null) != null) {
/*     */         Intrinsics.checkNotNullExpressionValue((StringsKt.startsWith$default(it, this.paramNameWithSeparator, false, 2, null) ? str1 : null).substring(this.paramNameWithSeparator.length()), "substring(...)");
/*     */         return (StringsKt.startsWith$default(it, this.paramNameWithSeparator, false, 2, null) ? str1 : null).substring(this.paramNameWithSeparator.length());
/*     */       }  }
/*     */     
/*     */     StringsKt.startsWith$default(it, this.paramNameWithSeparator, false, 2, null) ? str1 : null;
/*     */     return null; }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public final String getDecodedValueOrNull(@Nullable String nameAndValue) {
/*     */     String encodedValue;
/*     */     if (getValueOrNull(nameAndValue) == null) {
/*     */       getValueOrNull(nameAndValue);
/*     */       return null;
/*     */     } 
/*     */     return ShellCommandManager.Companion.access$decodeHex(ShellCommandManager.Companion, encodedValue);
/*     */   }
/*     */   
/*     */   private final <T> T fail() {
/*     */     throw new IllegalStateException("Cannot parse " + paramName());
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static EnumEntries<Param> getEntries() {
/*     */     return $ENTRIES;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\session\ShellCommandManager$Param.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */