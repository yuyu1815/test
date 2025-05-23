/*    */ package feedback;
/*    */ import com.intellij.ui.dsl.builder.Panel;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000<\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\b'\030\0002\0020\0012\0020\002B\017\022\006\020\003\032\0020\004¢\006\004\b\005\020\006J\020\020\t\032\0020\n2\006\020\013\032\0020\fH\026J\024\020\r\032\0020\n2\n\020\016\032\0060\017j\002`\020H\026J\016\020\021\032\0020\0002\006\020\007\032\0020\bJ\n\020\022\032\004\030\0010\023H&R\016\020\003\032\0020\004X\004¢\006\002\n\000R\020\020\007\032\004\030\0010\bX\016¢\006\002\n\000¨\006\024"}, d2 = {"Lfeedback/LabelBlock;", "Lfeedback/FeedbackBlock;", "Lfeedback/TextDescriptionProvider;", "myText", "", "<init>", "(Ljava/lang/String;)V", "bottomGap", "Lcom/intellij/ui/dsl/builder/BottomGap;", "addToPanel", "", "panel", "Lcom/intellij/ui/dsl/builder/Panel;", "collectBlockTextDescription", "stringBuilder", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "setBottomGap", "getLableFont", "Ljava/awt/Font;", "ej-ui"})
/*    */ @StabilityInferred(parameters = 0)
/*    */ public abstract class LabelBlock implements FeedbackBlock, TextDescriptionProvider {
/*    */   public LabelBlock(@NotNull String myText) {
/*  9 */     this.myText = myText;
/*    */   }
/*    */   @NotNull
/*    */   private final String myText; @Nullable
/*    */   private BottomGap bottomGap; public static final int $stable = 8;
/*    */   public void addToPanel(@NotNull Panel panel) {
/* 15 */     Intrinsics.checkNotNullParameter(panel, "panel"); Panel panel1 = panel, $this$addToPanel_u24lambda_u243 = panel1; int $i$a$-apply-LabelBlock$addToPanel$1 = 0;
/* 16 */     Row row1 = Panel.row$default($this$addToPanel_u24lambda_u243, null, this::addToPanel$lambda$3$lambda$1, 1, null);
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 21 */     Row $this$addToPanel_u24lambda_u243_u24lambda_u242 = row1; int $i$a$-apply-LabelBlock$addToPanel$1$2 = 0;
/* 22 */     if (this.bottomGap != null) {
/* 23 */       Intrinsics.checkNotNull(this.bottomGap); $this$addToPanel_u24lambda_u243_u24lambda_u242.bottomGap(this.bottomGap);
/*    */     } 
/*    */   } private static final Unit addToPanel$lambda$3$lambda$1(LabelBlock this$0, Row $this$row) { Intrinsics.checkNotNullParameter($this$row, "$this$row");
/*    */     $this$row.label(this$0.myText).applyToComponent(this$0::addToPanel$lambda$3$lambda$1$lambda$0);
/*    */     return Unit.INSTANCE; } private static final Unit addToPanel$lambda$3$lambda$1$lambda$0(LabelBlock this$0, JLabel $this$applyToComponent) { Intrinsics.checkNotNullParameter($this$applyToComponent, "$this$applyToComponent");
/*    */     $this$applyToComponent.setFont(this$0.getLableFont());
/*    */     return Unit.INSTANCE; }
/* 30 */   public void collectBlockTextDescription(@NotNull StringBuilder stringBuilder) { Intrinsics.checkNotNullParameter(stringBuilder, "stringBuilder"); StringBuilder stringBuilder1 = stringBuilder, $this$collectBlockTextDescription_u24lambda_u244 = stringBuilder1; int $i$a$-apply-LabelBlock$collectBlockTextDescription$1 = 0;
/* 31 */     Intrinsics.checkNotNullExpressionValue($this$collectBlockTextDescription_u24lambda_u244.append(this.myText), "append(...)"); Intrinsics.checkNotNullExpressionValue($this$collectBlockTextDescription_u24lambda_u244.append(this.myText).append('\n'), "append(...)"); $this$collectBlockTextDescription_u24lambda_u244.append(this.myText).append('\n');
/* 32 */     Intrinsics.checkNotNullExpressionValue($this$collectBlockTextDescription_u24lambda_u244.append('\n'), "append(...)"); $this$collectBlockTextDescription_u24lambda_u244.append('\n'); }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final LabelBlock setBottomGap(@NotNull BottomGap bottomGap) {
/* 37 */     Intrinsics.checkNotNullParameter(bottomGap, "bottomGap"); this.bottomGap = bottomGap;
/* 38 */     return this;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public abstract Font getLableFont();
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\feedback\LabelBlock.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */