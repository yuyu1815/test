/*    */ package com.intellij.ml.llm.matterhorn.ej.android.connectedTest;
/*    */ import com.intellij.ml.llm.matterhorn.ej.idea.run.TestEvent;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\002\b\005\n\002\030\002\n\002\030\002\n\002\030\002\n\000\b0\030\0002\0020\001:\003\004\005\006B\t\b\004¢\006\004\b\002\020\003\001\003\007\b\t¨\006\n"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/android/connectedTest/AndroidTestResultListenerEvent;", "", "<init>", "()V", "TestSuiteStarted", "TestCaseFinished", "TestSuiteFinished", "Lcom/intellij/ml/llm/matterhorn/ej/android/connectedTest/AndroidTestResultListenerEvent$TestCaseFinished;", "Lcom/intellij/ml/llm/matterhorn/ej/android/connectedTest/AndroidTestResultListenerEvent$TestSuiteFinished;", "Lcom/intellij/ml/llm/matterhorn/ej/android/connectedTest/AndroidTestResultListenerEvent$TestSuiteStarted;", "ej-android"})
/*    */ public abstract class AndroidTestResultListenerEvent {
/*    */   private AndroidTestResultListenerEvent() {}
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\030\002\n\002\b\003\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/android/connectedTest/AndroidTestResultListenerEvent$TestSuiteStarted;", "Lcom/intellij/ml/llm/matterhorn/ej/android/connectedTest/AndroidTestResultListenerEvent;", "<init>", "()V", "ej-android"})
/*    */   public static final class TestSuiteStarted extends AndroidTestResultListenerEvent { @NotNull
/*    */     public static final TestSuiteStarted INSTANCE = new TestSuiteStarted();
/*    */     
/* 12 */     private TestSuiteStarted() { super(null); } } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\007\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\t\020\b\032\0020\003HÆ\003J\023\020\t\032\0020\0002\b\b\002\020\002\032\0020\003HÆ\001J\023\020\n\032\0020\0132\b\020\f\032\004\030\0010\rHÖ\003J\t\020\016\032\0020\017HÖ\001J\t\020\020\032\0020\021HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007¨\006\022"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/android/connectedTest/AndroidTestResultListenerEvent$TestCaseFinished;", "Lcom/intellij/ml/llm/matterhorn/ej/android/connectedTest/AndroidTestResultListenerEvent;", "test", "Lcom/intellij/ml/llm/matterhorn/ej/idea/run/TestEvent;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ej/idea/run/TestEvent;)V", "getTest", "()Lcom/intellij/ml/llm/matterhorn/ej/idea/run/TestEvent;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ej-android"}) public static final class TestCaseFinished extends AndroidTestResultListenerEvent { @NotNull
/* 13 */     private final TestEvent test; public TestCaseFinished(@NotNull TestEvent test) { super(null); this.test = test; } @NotNull public final TestEvent component1() { return this.test; } @NotNull public final TestCaseFinished copy(@NotNull TestEvent test) { Intrinsics.checkNotNullParameter(test, "test"); return new TestCaseFinished(test); } @NotNull public String toString() { return "TestCaseFinished(test=" + this.test + ")"; } @NotNull public final TestEvent getTest() { return this.test; } public int hashCode() { return this.test.hashCode(); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof TestCaseFinished)) return false;  TestCaseFinished testCaseFinished = (TestCaseFinished)other; return !!Intrinsics.areEqual(this.test, testCaseFinished.test); } }
/* 14 */    @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\bÆ\n\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\023\020\004\032\0020\0052\b\020\006\032\004\030\0010\007HÖ\003J\t\020\b\032\0020\tHÖ\001J\t\020\n\032\0020\013HÖ\001¨\006\f"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/android/connectedTest/AndroidTestResultListenerEvent$TestSuiteFinished;", "Lcom/intellij/ml/llm/matterhorn/ej/android/connectedTest/AndroidTestResultListenerEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ej-android"}) public static final class TestSuiteFinished extends AndroidTestResultListenerEvent { private TestSuiteFinished() { super(null); }
/*    */ 
/*    */     
/*    */     @NotNull
/*    */     public static final TestSuiteFinished INSTANCE = new TestSuiteFinished();
/*    */     
/*    */     @NotNull
/*    */     public String toString() {
/*    */       return "TestSuiteFinished";
/*    */     }
/*    */     
/*    */     public int hashCode() {
/*    */       return -1833048183;
/*    */     }
/*    */     
/*    */     public boolean equals(@Nullable Object other) {
/*    */       if (this == other)
/*    */         return true; 
/*    */       if (!(other instanceof TestSuiteFinished))
/*    */         return false; 
/*    */       (TestSuiteFinished)other;
/*    */       return true;
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\android\connectedTest\AndroidTestResultListenerEvent.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */