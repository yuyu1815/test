/*    */ package feedback;
/*    */ 
/*    */ import androidx.compose.runtime.internal.StabilityInferred;
/*    */ import com.intellij.util.ui.JBFont;
/*    */ import java.awt.Font;
/*    */ import kotlin.Metadata;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\003\n\002\030\002\n\000\b\007\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\n\020\006\032\004\030\0010\007H\026R\016\020\002\032\0020\003X\004¢\006\002\n\000¨\006\b"}, d2 = {"Lfeedback/TopLabelBlock;", "Lfeedback/LabelBlock;", "myText", "", "<init>", "(Ljava/lang/String;)V", "getLableFont", "Ljava/awt/Font;", "ej-ui"})
/*    */ @StabilityInferred(parameters = 1)
/*    */ public final class TopLabelBlock
/*    */   extends LabelBlock
/*    */ {
/*    */   @NotNull
/*    */   private final String myText;
/*    */   public static final int $stable;
/*    */   
/*    */   public TopLabelBlock(@NotNull String myText) {
/* 45 */     super(myText); this.myText = myText; } @Nullable
/* 46 */   public Font getLableFont() { return (Font)JBFont.h1(); }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\feedback\TopLabelBlock.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */