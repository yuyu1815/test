/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks.explorer;
/*    */ @Serializable
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000>\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\004\n\002\020\b\n\000\n\002\030\002\n\002\b\b\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000  2\0020\001:\002\037 B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003¢\006\004\b\005\020\006B/\b\020\022\006\020\007\032\0020\b\022\b\020\002\032\004\030\0010\003\022\b\020\004\032\004\030\0010\003\022\b\020\t\032\004\030\0010\n¢\006\004\b\005\020\013J\t\020\017\032\0020\003HÆ\003J\t\020\020\032\0020\003HÆ\003J\035\020\021\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\003HÆ\001J\023\020\022\032\0020\0232\b\020\024\032\004\030\0010\001HÖ\003J\t\020\025\032\0020\bHÖ\001J\t\020\026\032\0020\003HÖ\001J%\020\027\032\0020\0302\006\020\031\032\0020\0002\006\020\032\032\0020\0332\006\020\034\032\0020\035H\001¢\006\002\b\036R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\f\020\rR\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\016\020\r¨\006!"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/explorer/Tip;", "", "displayText", "", "prompt", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getDisplayText", "()Ljava/lang/String;", "getPrompt", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$standalone", "$serializer", "Companion", "standalone"})
/*    */ @StabilityInferred(parameters = 1)
/*    */ public final class Tip { @NotNull
/*    */   public static final Companion Companion = new Companion(null); @NotNull
/*    */   private final String displayText; @NotNull
/*    */   private final String prompt; public static final int $stable; public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof Tip))
/*    */       return false; 
/*    */     Tip tip = (Tip)other;
/*    */     return !Intrinsics.areEqual(this.displayText, tip.displayText) ? false : (!!Intrinsics.areEqual(this.prompt, tip.prompt));
/*    */   } public int hashCode() {
/*    */     result = this.displayText.hashCode();
/*    */     return result * 31 + this.prompt.hashCode();
/*    */   }
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "Tip(displayText=" + this.displayText + ", prompt=" + this.prompt + ")";
/*    */   }
/*    */   @NotNull
/*    */   public final Tip copy(@NotNull String displayText, @NotNull String prompt) {
/*    */     Intrinsics.checkNotNullParameter(displayText, "displayText");
/*    */     Intrinsics.checkNotNullParameter(prompt, "prompt");
/*    */     return new Tip(displayText, prompt);
/*    */   }
/*    */   @NotNull
/*    */   public final String component2() {
/*    */     return this.prompt;
/*    */   }
/*    */   @NotNull
/*    */   public final String component1() {
/*    */     return this.displayText;
/*    */   }
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/explorer/Tip$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/explorer/Tip;", "standalone"})
/*    */   public static final class Companion { @NotNull
/* 39 */     public final KSerializer<Tip> serializer() { return (KSerializer<Tip>)Tip.$serializer.INSTANCE; } private Companion() {} } @NotNull
/* 40 */   public final String getPrompt() { return this.prompt; } @NotNull public final String getDisplayText() { return this.displayText; } public Tip(@NotNull String displayText, @NotNull String prompt) { this.displayText = displayText; this.prompt = prompt; }
/*    */    }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\standalone.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\explorer\Tip.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */