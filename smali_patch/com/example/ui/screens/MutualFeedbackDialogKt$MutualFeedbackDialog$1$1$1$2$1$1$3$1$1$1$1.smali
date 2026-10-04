.class final Lcom/example/ui/screens/MutualFeedbackDialogKt$MutualFeedbackDialog$1$1$1$2$1$1$3$1$1$1$1;
.super Ljava/lang/Object;
.source "MutualFeedbackDialog.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/example/ui/screens/MutualFeedbackDialogKt;->MutualFeedbackDialog(Lcom/example/data/Book;Lcom/example/ui/screens/FeedbackTargetType;Lcom/example/ui/BookViewModel;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function0<",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $isSelected:Z

.field final synthetic $selectedBookTags:Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/snapshots/SnapshotStateList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $tag:Ljava/lang/String;


# direct methods
.method constructor <init>(ZLandroidx/compose/runtime/snapshots/SnapshotStateList;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Landroidx/compose/runtime/snapshots/SnapshotStateList<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    iput-boolean p1, p0, Lcom/example/ui/screens/MutualFeedbackDialogKt$MutualFeedbackDialog$1$1$1$2$1$1$3$1$1$1$1;->$isSelected:Z

    iput-object p2, p0, Lcom/example/ui/screens/MutualFeedbackDialogKt$MutualFeedbackDialog$1$1$1$2$1$1$3$1$1$1$1;->$selectedBookTags:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    iput-object p3, p0, Lcom/example/ui/screens/MutualFeedbackDialogKt$MutualFeedbackDialog$1$1$1$2$1$1$3$1$1$1$1;->$tag:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 0

    .line 163
    invoke-virtual {p0}, Lcom/example/ui/screens/MutualFeedbackDialogKt$MutualFeedbackDialog$1$1$1$2$1$1$3$1$1$1$1;->invoke()V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public final invoke()V
    .locals 2

    .line 164
    iget-boolean v0, p0, Lcom/example/ui/screens/MutualFeedbackDialogKt$MutualFeedbackDialog$1$1$1$2$1$1$3$1$1$1$1;->$isSelected:Z

    iget-object v1, p0, Lcom/example/ui/screens/MutualFeedbackDialogKt$MutualFeedbackDialog$1$1$1$2$1$1$3$1$1$1$1;->$selectedBookTags:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    iget-object p0, p0, Lcom/example/ui/screens/MutualFeedbackDialogKt$MutualFeedbackDialog$1$1$1$2$1$1$3$1$1$1$1;->$tag:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-virtual {v1, p0}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->remove(Ljava/lang/Object;)Z

    return-void

    :cond_0
    invoke-virtual {v1, p0}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->add(Ljava/lang/Object;)Z

    return-void
.end method
