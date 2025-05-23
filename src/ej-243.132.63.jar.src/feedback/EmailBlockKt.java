/*    */ package feedback;
/*    */ import com.intellij.ide.BrowserUtil;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import java.net.URL;
/*    */ import javax.swing.event.HyperlinkEvent;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.text.Regex;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000.\n\000\n\002\020\b\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\032,\020\b\032\0020\t*\0020\n2\b\020\013\032\004\030\0010\f2\006\020\r\032\0020\0162\f\020\017\032\b\022\004\022\0020\t0\020H\000\"\016\020\000\032\0020\001XT¢\006\002\n\000\"\016\020\002\032\0020\001XT¢\006\002\n\000\"\016\020\003\032\0020\001XT¢\006\002\n\000\"\024\020\004\032\0020\005X\004¢\006\b\n\000\032\004\b\006\020\007¨\006\021"}, d2 = {"TEXT_AREA_ROW_SIZE", "", "TEXT_FIELD_EMAIL_COLUMN_SIZE", "COMBOBOX_COLUMN_SIZE", "EMAIL_REGEX", "Lkotlin/text/Regex;", "getEMAIL_REGEX", "()Lkotlin/text/Regex;", "feedbackAgreement", "", "Lcom/intellij/ui/dsl/builder/Row;", "project", "Lcom/intellij/openapi/project/Project;", "agreementText", "", "systemInfo", "Lkotlin/Function0;", "ej-ui"})
/*    */ public final class EmailBlockKt {
/*    */   public static final int TEXT_AREA_ROW_SIZE = 5;
/*    */   @NotNull
/* 16 */   private static final Regex EMAIL_REGEX = new Regex("^[a-zA-Z0-9\\\\._%+!$&*=^|~#{}-]+@([a-zA-Z0-9\\\\-]+\\.)+([a-zA-Z]{2,22})$"); public static final int TEXT_FIELD_EMAIL_COLUMN_SIZE = 25; public static final int COMBOBOX_COLUMN_SIZE = 25; @NotNull public static final Regex getEMAIL_REGEX() { return EMAIL_REGEX; }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static final void feedbackAgreement(@NotNull Row $this$feedbackAgreement, @Nullable Project project, @NotNull String agreementText, @NotNull Function0 systemInfo) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: ldc '<this>'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_2
/*    */     //   7: ldc 'agreementText'
/*    */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   12: aload_3
/*    */     //   13: ldc 'systemInfo'
/*    */     //   15: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   18: aload_0
/*    */     //   19: aload_2
/*    */     //   20: iconst_m1
/*    */     //   21: aload_3
/*    */     //   22: aload_1
/*    */     //   23: <illegal opcode> hyperlinkActivated : (Lkotlin/jvm/functions/Function0;Lcom/intellij/openapi/project/Project;)Lcom/intellij/ui/dsl/builder/HyperlinkEventAction;
/*    */     //   28: invokeinterface comment : (Ljava/lang/String;ILcom/intellij/ui/dsl/builder/HyperlinkEventAction;)Lcom/intellij/ui/dsl/builder/Cell;
/*    */     //   33: pop
/*    */     //   34: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #77	-> 18
/*    */     //   #85	-> 34
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	35	0	$this$feedbackAgreement	Lcom/intellij/ui/dsl/builder/Row;
/*    */     //   0	35	1	project	Lcom/intellij/openapi/project/Project;
/*    */     //   0	35	2	agreementText	Ljava/lang/String;
/*    */     //   0	35	3	systemInfo	Lkotlin/jvm/functions/Function0;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private static final void feedbackAgreement$lambda$1(Function0 $systemInfo, Project $project, HyperlinkEvent it) {
/* 78 */     Intrinsics.checkNotNullParameter(it, "it");
/* 79 */     if (Intrinsics.areEqual(it.getDescription(), "systemInfo")) { $systemInfo.invoke(); }
/* 80 */     else { URL url = it.getURL(); int $i$a$-let-EmailBlockKt$feedbackAgreement$1$1 = 0;
/* 81 */       BrowserUtil.browse(url.toExternalForm(), $project);
/*    */       it.getURL(); }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\feedback\EmailBlockKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */