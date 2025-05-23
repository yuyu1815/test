/*     */ package com.intellij.ml.llm.matterhorn.ej.idea.run;
/*     */ 
/*     */ import kotlin.Metadata;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\004\n\002\030\002\n\002\b\020\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B3\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\b\020\005\032\004\030\0010\003\022\b\020\006\032\004\030\0010\003\022\006\020\007\032\0020\b¢\006\004\b\t\020\nJ\t\020\022\032\0020\003HÆ\003J\t\020\023\032\0020\003HÆ\003J\013\020\024\032\004\030\0010\003HÆ\003J\013\020\025\032\004\030\0010\003HÆ\003J\t\020\026\032\0020\bHÆ\003J?\020\027\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0032\n\b\002\020\005\032\004\030\0010\0032\n\b\002\020\006\032\004\030\0010\0032\b\b\002\020\007\032\0020\bHÆ\001J\023\020\030\032\0020\0312\b\020\032\032\004\030\0010\033HÖ\003J\t\020\034\032\0020\035HÖ\001J\t\020\036\032\0020\003HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\013\020\fR\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\r\020\fR\023\020\005\032\004\030\0010\003¢\006\b\n\000\032\004\b\016\020\fR\023\020\006\032\004\030\0010\003¢\006\b\n\000\032\004\b\017\020\fR\021\020\007\032\0020\b¢\006\b\n\000\032\004\b\020\020\021¨\006\037"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/idea/run/TestEvent;", "Lcom/intellij/ml/llm/matterhorn/ej/idea/run/RunEvent;", "name", "", "text", "stackTrace", "errorMessage", "testResult", "Lcom/intellij/ml/llm/matterhorn/ej/idea/run/TestResult;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/idea/run/TestResult;)V", "getName", "()Ljava/lang/String;", "getText", "getStackTrace", "getErrorMessage", "getTestResult", "()Lcom/intellij/ml/llm/matterhorn/ej/idea/run/TestResult;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ej-idea"})
/*     */ public final class TestEvent
/*     */   extends RunEvent
/*     */ {
/*     */   @NotNull
/*     */   private final String name;
/*     */   @NotNull
/*     */   private final String text;
/*     */   @Nullable
/*     */   private final String stackTrace;
/*     */   @Nullable
/*     */   private final String errorMessage;
/*     */   @NotNull
/*     */   private final TestResult testResult;
/*     */   
/*     */   @NotNull
/*     */   public final String getName() {
/* 236 */     return this.name; } @NotNull public final String getText() { return this.text; } @Nullable public final String getStackTrace() { return this.stackTrace; } @Nullable public final String getErrorMessage() { return this.errorMessage; } @NotNull
/* 237 */   public final TestResult getTestResult() { return this.testResult; } public TestEvent(@NotNull String name, @NotNull String text, @Nullable String stackTrace, @Nullable String errorMessage, @NotNull TestResult testResult) {
/* 238 */     super(null);
/*     */     this.name = name;
/*     */     this.text = text;
/*     */     this.stackTrace = stackTrace;
/*     */     this.errorMessage = errorMessage;
/*     */     this.testResult = testResult;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String component1() {
/*     */     return this.name;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String component2() {
/*     */     return this.text;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final String component3() {
/*     */     return this.stackTrace;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final String component4() {
/*     */     return this.errorMessage;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final TestResult component5() {
/*     */     return this.testResult;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final TestEvent copy(@NotNull String name, @NotNull String text, @Nullable String stackTrace, @Nullable String errorMessage, @NotNull TestResult testResult) {
/*     */     Intrinsics.checkNotNullParameter(name, "name");
/*     */     Intrinsics.checkNotNullParameter(text, "text");
/*     */     Intrinsics.checkNotNullParameter(testResult, "testResult");
/*     */     return new TestEvent(name, text, stackTrace, errorMessage, testResult);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "TestEvent(name=" + this.name + ", text=" + this.text + ", stackTrace=" + this.stackTrace + ", errorMessage=" + this.errorMessage + ", testResult=" + this.testResult + ")";
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     result = this.name.hashCode();
/*     */     result = result * 31 + this.text.hashCode();
/*     */     result = result * 31 + ((this.stackTrace == null) ? 0 : this.stackTrace.hashCode());
/*     */     result = result * 31 + ((this.errorMessage == null) ? 0 : this.errorMessage.hashCode());
/*     */     return result * 31 + this.testResult.hashCode();
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof TestEvent))
/*     */       return false; 
/*     */     TestEvent testEvent = (TestEvent)other;
/*     */     return !Intrinsics.areEqual(this.name, testEvent.name) ? false : (!Intrinsics.areEqual(this.text, testEvent.text) ? false : (!Intrinsics.areEqual(this.stackTrace, testEvent.stackTrace) ? false : (!Intrinsics.areEqual(this.errorMessage, testEvent.errorMessage) ? false : (!(this.testResult != testEvent.testResult)))));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\idea\run\TestEvent.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */