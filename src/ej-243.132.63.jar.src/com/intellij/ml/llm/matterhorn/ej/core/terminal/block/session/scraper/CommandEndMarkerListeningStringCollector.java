/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session.scraper;
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\016\n\000\n\002\030\002\n\002\020\002\n\002\b\004\n\002\020\b\n\002\b\005\b\000\030\000 \0202\0020\001:\001\020B'\022\006\020\002\032\0020\001\022\b\020\003\032\004\030\0010\004\022\f\020\005\032\b\022\004\022\0020\0070\006¢\006\004\b\b\020\tJ\b\020\n\032\0020\004H\026J\t\020\013\032\0020\fH\001J\t\020\r\032\0020\007H\001J\021\020\016\032\0020\0072\006\020\017\032\0020\004H\001R\016\020\002\032\0020\001X\004¢\006\002\n\000R\020\020\003\032\004\030\0010\004X\004¢\006\002\n\000R\024\020\005\032\b\022\004\022\0020\0070\006X\004¢\006\002\n\000¨\006\021"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/scraper/CommandEndMarkerListeningStringCollector;", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/scraper/StringCollector;", "delegate", "commandEndMarker", "", "onFound", "Lkotlin/Function0;", "", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/scraper/StringCollector;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "buildText", "length", "", "newline", "write", "text", "Companion", "ej-core"})
/*    */ public final class CommandEndMarkerListeningStringCollector implements StringCollector { @NotNull
/*    */   public static final Companion Companion = new Companion(null); @NotNull
/*    */   private final StringCollector delegate;
/*    */   
/*  7 */   public CommandEndMarkerListeningStringCollector(@NotNull StringCollector delegate, @Nullable String commandEndMarker, @NotNull Function0<Unit> onFound) { this.delegate = delegate;
/*  8 */     this.commandEndMarker = commandEndMarker;
/*  9 */     this.onFound = onFound; } @Nullable
/*    */   private final String commandEndMarker; @NotNull
/*    */   private final Function0<Unit> onFound; @NotNull
/*    */   public String buildText() {
/* 13 */     String text = this.delegate.buildText();
/*    */     
/* 15 */     if (this.commandEndMarker == null) {
/* 16 */       return text;
/*    */     }
/*    */     
/* 19 */     String trimmedText = StringsKt.trimEnd(text).toString();
/* 20 */     if (StringsKt.endsWith$default(trimmedText, this.commandEndMarker, false, 2, null)) {
/* 21 */       String outputText = StringsKt.dropLast(trimmedText, this.commandEndMarker.length());
/* 22 */       this.onFound.invoke();
/* 23 */       return outputText;
/*    */     } 
/*    */ 
/*    */     
/* 27 */     int indexOfSuffix = Companion.indexOfSuffix(trimmedText, this.commandEndMarker, CommandEndMarkerListeningStringCollector::buildText$lambda$0);
/* 28 */     if (indexOfSuffix >= 0) {
/* 29 */       Intrinsics.checkNotNullExpressionValue(trimmedText.substring(0, indexOfSuffix), "substring(...)"); String commandText = trimmedText.substring(0, indexOfSuffix);
/* 30 */       this.onFound.invoke();
/* 31 */       return commandText;
/*    */     } 
/*    */     
/* 34 */     return text;
/*    */   }
/*    */   public void write(@NotNull String text) {
/*    */     Intrinsics.checkNotNullParameter(text, "text");
/*    */     this.delegate.write(text);
/*    */   }
/*    */   public void newline() {
/*    */     this.delegate.newline();
/*    */   }
/*    */   public int length() {
/*    */     return this.delegate.length();
/*    */   }
/*    */   private static final boolean buildText$lambda$0(char it) {
/*    */     return (it == '\n');
/*    */   }
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\b\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\002\020\f\n\002\020\013\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J*\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\0072\022\020\t\032\016\022\004\022\0020\013\022\004\022\0020\f0\n¨\006\r"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/scraper/CommandEndMarkerListeningStringCollector$Companion;", "", "<init>", "()V", "indexOfSuffix", "", "text", "", "suffix", "ignoredCharacters", "Lkotlin/Function1;", "", "", "ej-core"})
/*    */   public static final class Companion { private Companion() {}
/*    */     
/*    */     public final int indexOfSuffix(@NotNull String text, @NotNull String suffix, @NotNull Function1 ignoredCharacters) {
/* 53 */       Intrinsics.checkNotNullParameter(text, "text"); Intrinsics.checkNotNullParameter(suffix, "suffix"); Intrinsics.checkNotNullParameter(ignoredCharacters, "ignoredCharacters"); if (!((((CharSequence)suffix).length() > 0) ? 1 : 0)) { String str = "Check failed."; throw new IllegalStateException(str.toString()); }
/* 54 */        if (text.length() < suffix.length()) return -1; 
/* 55 */       int textInd = text.length();
/* 56 */       for (int suffixInd = suffix.length() - 1; -1 < suffixInd; suffixInd--) {
/* 57 */         textInd--;
/* 58 */         while (textInd >= 0 && ((Boolean)ignoredCharacters.invoke(Character.valueOf(text.charAt(textInd)))).booleanValue()) {
/* 59 */           textInd--;
/*    */         }
/* 61 */         if (textInd < 0 || text.charAt(textInd) != suffix.charAt(suffixInd)) {
/* 62 */           return -1;
/*    */         }
/*    */       } 
/* 65 */       return textInd;
/*    */     } }
/*    */    }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\session\scraper\CommandEndMarkerListeningStringCollector.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */